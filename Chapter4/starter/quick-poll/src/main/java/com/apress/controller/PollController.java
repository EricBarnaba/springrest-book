package com.apress.controller;

import com.apress.repository.PollRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {

    //@Inject
    private PollRepository pollRepository;
}
