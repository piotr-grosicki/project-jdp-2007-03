package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.GroupDto;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/v1/group")
public class GroupController {

    @RequestMapping(method = RequestMethod.GET)
    public List<GroupDto> getGroups() {

        return new ArrayList<>();
    }


    @RequestMapping(method = RequestMethod.GET, value = "/{groupId}")
    public GroupDto getGroup(@PathParam ("groupId") Long groupId) {

        return new GroupDto();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public GroupDto updateGroup(@RequestBody GroupDto groupDto) {

        return new GroupDto();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createGroup(@RequestBody GroupDto groupDto) {

    }
}
