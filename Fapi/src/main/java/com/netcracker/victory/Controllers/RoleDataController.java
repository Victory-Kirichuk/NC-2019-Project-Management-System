package com.netcracker.victory.Controllers;



import com.netcracker.victory.models.RoleModel;
import com.netcracker.victory.service.RoleDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleDataController {


    @Autowired
    private RoleDataService roleDataService;

    @RequestMapping()
    public ResponseEntity<List<RoleModel>> getProjects(){
        return ResponseEntity.ok(roleDataService.getAll());
    }



    @RequestMapping (value = "/{roleId}",method = RequestMethod.GET)
    public ResponseEntity<RoleModel> getRoleByRoleId(@PathVariable(name ="roleId")int roleId)
    {RoleModel roleModel=roleDataService.getRoleByRoleId(roleId);
        return  ResponseEntity.ok(roleModel);}



}
