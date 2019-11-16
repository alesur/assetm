package io.github.alesur.assetm.restfullwebservice.asset.computer;

import io.github.alesur.assetm.restfullwebservice.asset.computer.ComputerAsset;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerAssetHardCodedService {

    private static List<ComputerAsset> assets = new ArrayList();
    private static int idCounter = 0;

    static{
        assets.add(new ComputerAsset(++idCounter,"Kiwa", "S372893", "USER-PC", "some PC", "Windows 10", "1809","Laptop","Lenovo" ));
        assets.add(new ComputerAsset(++idCounter,"Kiwa", "S542893", "VASIA-PC", "any some PC", "Windows 7", "1809","Desktop","Acer" ));
        assets.add(new ComputerAsset(++idCounter,"Kiwa", "S545489", "ANNA-PC", "some other PC", "Windows 10", "1905","Laptop","Asus" ));

    }

    public List<ComputerAsset> findAll(){

        return assets;
    }
}
