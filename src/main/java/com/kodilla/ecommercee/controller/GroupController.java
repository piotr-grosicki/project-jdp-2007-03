package com.kodilla.ecommercee.controller;


import com.kodilla.ecommercee.domain.dto.GroupDto;
import com.kodilla.ecommercee.exception.GroupNotFoundException;
import com.kodilla.ecommercee.mapper.GroupMapper;
import com.kodilla.ecommercee.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @Autowired
    private GroupMapper groupMapper;


    @GetMapping("/groups")
    public List<GroupDto> getGroups() {
        return groupMapper.mapToGroupDtoList(groupService.getAllGroups());
    }

    @GetMapping("/{groupId}")
    public GroupDto getGroup(@PathVariable("groupId") Long groupId) throws GroupNotFoundException {
        return groupMapper.mapToGroupDto(groupService.getGroup(groupId).orElseThrow(GroupNotFoundException::new));
    }

    @DeleteMapping("/{groupId}")
    public void deleteGroupById(@PathVariable("groupId") Long groupId){
        groupService.deleteGroup(groupId);
    }

    @PutMapping("")
    public GroupDto updateGroup(@RequestBody GroupDto groupDto) {
        return groupMapper.mapToGroupDto(groupService.saveGroup(groupMapper.mapToGroup(groupDto)));
    }

    @PostMapping("")
    public void createGroup(@RequestBody GroupDto groupDto) {
        groupService.saveGroup(groupMapper.mapToGroup(groupDto));

    }
}

