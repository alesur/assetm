package io.github.alesur.assetm.restfullwebservice.asset.computer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//Add React Read access from service
//@CrossOrigin(origins="http://localhost:3000")
public class AssetResource {

    @Autowired
    private ComputerAssetHardCodedService computerAssetService;

    @GetMapping ("/manage/site/{site}/dashboard")
    public List<ComputerAsset> getAllComputerAssets(@PathVariable String site){
        return computerAssetService.findAll();
    }

}
