//package com.fairyoo.fring.controller;
//
//import com.fairyoo.fring.web.controller.UserController;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
//
///**
// * @author MengYi at 2019-01-08 15:08
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserControllerTest {
//
//
//    private MockMvc mvc;
//
//    //初始化执行
//    @Before
//    public void setUp() throws Exception {
//        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
//    }
//
//
//    /**
//     * 验证controller是否正常响应并打印返回结果
//     *
//     * @author by MengYi at 2019-01-08 15:17
//    */
//    @Test
//    public void getString() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/fring/v1/getString").accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andReturn();
//    }
//
//
////    /**
////     * 验证controller是否正常响应并判断返回结果是否正确
////     *
////     * @author by MengYi at 2019-01-08 15:18
////    */
////    @Test
////    public void getUsersByOrgIds() throws Exception {
////        mvc.perform(MockMvcRequestBuilders.get("/fring/v1/users/org")
////                //.contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
////                .param("orgIds", "1")
////                //.accept(MediaType.APPLICATION_JSON_UTF8_VALUE)
////        )
////                .andExpect(MockMvcResultMatchers.status().isOk())
////                .andDo(MockMvcResultHandlers.print())
////                .andReturn();
////                //.andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
////    }
//
//}
