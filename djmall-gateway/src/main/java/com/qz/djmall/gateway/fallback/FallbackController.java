package com.qz.djmall.gateway.fallback;

import com.qz.djmall.gateway.common.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @RequestMapping("/fallback")
    public R fallback() {
        return R.error(500, "网关转发服务失败");
    }
}

