package com.lhp.controller;

import com.lhp.domain.Product;
import com.lhp.service.ProdectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProdectService prodectService;

    /**
     *查询所有产品
     * @return
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        List<Product> list = prodectService.findAll();
        mv.addObject("productList", list);
        mv.setViewName("product-list");
        return mv;
    }

    /**
     * 保存产品
     * @param product
     * @return
     */
    @RequestMapping("/save.do")
    public String save(Product product) {
        prodectService.save(product);
        return "redirect:/product/findAll.do";
    }

}
