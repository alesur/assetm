package io.github.alesur.assetm.restfullwebservice.asset.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssetResource {

    @Autowired
    private ComputerAssetHardCodedService computerAssetService;

    @GetMapping ("/manage/site/{site}/dashboard")
    public List<ComputerAsset> getAllComputerAssets(@PathVariable String site){
        return computerAssetService.findAll();
    }

}
