package cn.iwyu.controller;/**
 * Created by Chester on 3/10/2020.
 */

import cn.iwyu.domain.*;
import cn.iwyu.service.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ClassName RestaurantController
 * @Description
 * @Author XiaoMao
 * @Date 3/10/2020 上午8:41
 * @Version 1.0
 **/
@Controller
@RequestMapping("/restaurant")
public class RestaurantController {
    @Resource
    private RestaurantService service;

    @RequestMapping("/findAll")
    @ResponseBody
    public Msg findAll(){
        List<RestaurantCustom> restaurants = service.findAll();
        if(restaurants.size()>0){
            for (RestaurantCustom r:restaurants
                 ) {

            }
            return Msg.succeed().add(restaurants,restaurants.size());
        }
        return Msg.fail();
    }
    @RequestMapping("/checkRecommend")
    @ResponseBody
    public Msg checkRecommend(){
        List<RestaurantCustom> restaurantCustoms = service.checkRecommend();
        if(restaurantCustoms.size()>0){
            return Msg.succeed().add(restaurantCustoms,restaurantCustoms.size());
        }
        return Msg.fail();
    }
    @RequestMapping("/findByExample")
    @ResponseBody
    public Msg findByExample(RestaurantExample example){
        List<RestaurantCustom> restaurantCustoms = service.findByExample(example);
        if(restaurantCustoms.size()>0){
            return Msg.succeed().add(restaurantCustoms,restaurantCustoms.size());
        }
        return Msg.fail();
    }
    @RequestMapping("/update")
    @ResponseBody
    public Msg update(Restaurant restaurant){
        Integer flag = service.update(restaurant);
        if(flag==1){
            return Msg.succeed();
        }
        return Msg.fail();
    }
    @RequestMapping("/save")
    @ResponseBody
    public Msg save(Restaurant restaurant){
        Integer flag = service.save(restaurant);
        if(flag==1){
            return Msg.succeed();
        }
        return Msg.fail();
    }
    @RequestMapping("/delete")
    @ResponseBody
    public Msg delete(Integer idRestaurant){
        Integer flag = service.delete(idRestaurant);
        if(flag>0){
            return Msg.succeed();
        }
        return Msg.fail();
    }
}
