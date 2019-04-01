package com.ocean.basicinfo.basiccontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//https://blog.csdn.net/weililansehudiefei/article/details/71023455

/**
 * @author 金海洋
 * @date 2019/3/27  -15:34
 */


@Controller
@RequestMapping("/hello")
public class BasicInfoController {

	private static final Logger logger = LoggerFactory.getLogger(BasicInfoController.class);


	/**
	 *
	 * @param materialVo
	 * @param request
	 * @param response
	 * @param dataGrid
	 */

	@RequestMapping(params = "dataGridMaterial")
	@ResponseBody
	public void dataGridMaterial(MaterialEntity materialEntity, HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {

		int a=1;

		System.out.println(a);

	}





}
