package com.maczm.helloworld.controller;

import com.maczm.helloworld.service.CommonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wangzm
 */
@RestController
public class CommonController {
    
    final
    CommonService commonService;
    
    public CommonController(CommonService commonService) {this.commonService = commonService;}
    
    
    @GetMapping("/computerWrinkles")
    public int computerWrinkles() {
        return commonService.computerWrinkles(1, 2);
    }
    
    @GetMapping("/binarySearch")
    public int binarySearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        return commonService.binarySearch(arr, 0, arr.length - 1, 2);
    }
    
    @GetMapping("/quickSort")
    public int[] quickSort() {
        long l = System.currentTimeMillis();
        int[] arr = generateArray();
        System.out.println(System.currentTimeMillis() - l);
        return commonService.quickSort(arr, 0, arr.length - 1);
    }
    
    @GetMapping("/bubbleSort")
    public int[] bubbleSort() {
        long l = System.currentTimeMillis();
        int[] arr = generateArray();
        System.out.println(System.currentTimeMillis() - l);
        return commonService.bubbleSort(arr);
    }
    
    public int[] generateArray() {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        return arr;
    }
}
