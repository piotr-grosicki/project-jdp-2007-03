package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.dto.GroupDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/v1/group")
public class GroupController {

    @GetMapping("/groups")
    public List<GroupDto> getGroups() {
        return new ArrayList<>();
    }

    @GetMapping("/{groupId}")
    public GroupDto getGroup(@PathVariable ("groupId") Long groupId) {
        return new GroupDto();
    }

    @DeleteMapping("/{groupId}")
    public void deleteGroupById(@PathVariable("groupId") Long groupId){
    }

    @PutMapping("")
    public GroupDto updateGroup(@RequestBody GroupDto groupDto) {
        return new GroupDto();
    }

    @PostMapping("")
    public void createGroup(@RequestBody GroupDto groupDto) {
    }
}

