package com.example.controller;

import com.example.domain.Product;
import com.example.domain.ProductForm;
import com.example.service.ProductService;
import com.example.validator.ProductValidator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {

    private static final Log logger
            = LogFactory.getLog(ProductController.class);

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setValidator(new ProductValidator());
        webDataBinder.validate();
    }

    @RequestMapping(value = "/product_input", method = RequestMethod.GET)
    public String inputProduct(Model model) {
        model.addAttribute("product", new Product());
        return "ProductForm";
    }

    @RequestMapping(value = "/product_save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute Product product,
                              BindingResult bindingResult,

                              Model model
    ) {

        ProductValidator productValidator = new ProductValidator();
        productValidator.validate(product, bindingResult);

        if (bindingResult.hasErrors()) {
            return "ProductForm";
        }

        /*
         auto binding without product form object
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        product.setPrice(productForm.getPrice());
        */

        model.addAttribute("product", product);
        logger.info("saveProduct called");

        Product savedProduct = productService.add(product);
        /*
        redirectAttributes.addFlashAttribute
                ("message", "The product was successfully added");
        return "redirect:/product_view/" + savedProduct.getId();
        */
        return "ProductDetails";
    }

    @RequestMapping(value = "/product_view/{id}", method = RequestMethod.GET)
    public String viewProduct(@PathVariable Long id, Model model) {
        Product product = productService.get(id);
        model.addAttribute("product", product);
        return "ProductView";
    }
}
