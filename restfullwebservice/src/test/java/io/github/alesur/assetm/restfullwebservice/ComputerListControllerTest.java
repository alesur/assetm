package io.github.alesur.assetm.restfullwebservice;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import io.github.alesur.assetm.restfullwebservice.asset.computer.controller.ComputerListController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
@RunWith(SpringRunner.class)
@WebMvcTest(ComputerListController.class)
public class ComputerListControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testComputerAssetListView() throws Exception {
        mockMvc.perform(get("/manage/site/kiwa/computers"))
                .andExpect(status().isOk());
               // .andExpect(view().name("computer-list.html"))
              //  .andExpect(content().string(
                  //      containsString("ASSET LIST: COMPUTERS")));

    }
}

