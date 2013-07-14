package com.caiuu.core.service;

import com.caiuu.core.dao.CategoryMapper;
import com.caiuu.core.entity.Category;
import com.caiuu.core.entity.CategoryLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * User: lianghongbin
 * Date: 7/3/13
 * Time: 11:02
 * Description:
 */
@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> findAll() {
        return categoryMapper.selectAll();
    }

    public int count() {
        return categoryMapper.count();
    }

    public Category find(int id) {
        return categoryMapper.select(id);
    }

    public int delete(int id) {
        return categoryMapper.delete(id);
    }

    public int save(Category category) {
        return categoryMapper.insert(category);
    }

    public int update(Category category) {
        return categoryMapper.update(category);
    }

    public List<Category> findTopLevel() {
        return categoryMapper.selectTopLevel();
    }

    public List<Category> findByParent(int parentId) {
        return categoryMapper.selectByParent(parentId);
    }

    public List<CategoryLink> getCategoryLink() {
        List<Category> categories = findTopLevel();
        List<CategoryLink> categoryLinks = new ArrayList<CategoryLink>(categories.size());
        for (Category category : categories) {
            categoryLinks.add(recursion(category));
        }

        return categoryLinks;
    }

    public List<Category> getCategoryFamilyById(int categoryId) {
        List<Category> family = new ArrayList<Category>();
        getCategoryFamily(family, categoryId);

        return family;
    }

    private CategoryLink recursion(Category category) {
        CategoryLink link = new CategoryLink();
        link.setCategory(category);
        List<Category> categories = findByParent(category.getId());

        if (categories == null || categories.size() == 0) {
            return link;
        }

        List<CategoryLink> children = new ArrayList<CategoryLink>(categories.size());

        for (Category c : categories) {
            children.add(recursion(c));
        }

        link.setChildren(children);

        return link;
    }

    private void getCategoryFamily(List<Category> family, int categoryId) {
        Category category = find(categoryId);
        if (category.getParentId() > 0) {
            getCategoryFamily(family, category.getParentId());
        }

        family.add(category);
    }
}
