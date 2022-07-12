package com.penghy.server.cotroller;

import com.penghy.server.bean.DrugDict1;
import com.penghy.server.bean.OrderDict1;
import com.penghy.server.bean.Person;
import com.penghy.server.bean.PubDict;
import com.penghy.server.service.PersonService;
import com.penghy.server.uploadtest.service.impl.ImportserviceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(TestController.class)
class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PersonService mockPersonService;
    @MockBean
    private ImportserviceImpl mockImportservice;

    @Test
    void testSelectwowjoydrugdict1() throws Exception {
        // Setup
        when(mockImportservice.importTprkxx(any(MultipartFile.class))).thenReturn(new HashMap<>());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(multipart("/httpService/upload")
                        .file(new MockMultipartFile("file", "originalFilename", MediaType.APPLICATION_JSON_VALUE,
                                "content".getBytes()))
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockImportservice).importTprkxx(any(MultipartFile.class));
    }

    @Test
    void testSelectwowjoydrugdict1_ThrowsException() throws Exception {
        // Setup
        when(mockImportservice.importTprkxx(any(MultipartFile.class))).thenReturn(new HashMap<>());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(multipart("/httpService/upload")
                        .file(new MockMultipartFile("file", "originalFilename", MediaType.APPLICATION_JSON_VALUE,
                                "content".getBytes()))
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockImportservice).importTprkxx(any(MultipartFile.class));
    }

    @Test
    void testSelectwowjoydrugdict2() throws Exception {
        // Setup
        // Configure PersonService.selectwowjoydrugdict(...).
        final DrugDict1 drugDict1 = new DrugDict1();
        drugDict1.setIncrementId(0);
        drugDict1.setInsureDrugGrade("insureDrugGrade");
        drugDict1.setInsureDrugCode("insureDrugCode");
        drugDict1.setDrugChineseName("drugChineseName");
        drugDict1.setChargeItemCode("chargeItemCode");
        drugDict1.setDrugFactoryName("drugFactoryName");
        drugDict1.setDrugMinUnit("drugMinUnit");
        drugDict1.setInsureDrugSpec("insureDrugSpec");
        drugDict1.setDrugDosageForm("drugDosageForm");
        drugDict1.setDrugEnglishName("drugEnglishName");
        drugDict1.setSearchCode1("searchCode1");
        drugDict1.setSearchCode2("searchCode2");
        drugDict1.setUseStartTime("useStartTime");
        drugDict1.setUseEndTime("useEndTime");
        drugDict1.setDrugApproveNum("drugApproveNum");
        final List<DrugDict1> drugDict1s = Arrays.asList(drugDict1);
        when(mockPersonService.selectwowjoydrugdict()).thenReturn(drugDict1s);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoydrugdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatetwowjoydrugdict(0, "searchCode1");
    }

    @Test
    void testSelectwowjoydrugdict2_PersonServiceSelectwowjoydrugdictReturnsNoItems() throws Exception {
        // Setup
        when(mockPersonService.selectwowjoydrugdict()).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoydrugdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatetwowjoydrugdict(0, "searchCode1");
    }

    @Test
    void testSelectwowjoydrugdict2_ThrowsException() throws Exception {
        // Setup
        // Configure PersonService.selectwowjoydrugdict(...).
        final DrugDict1 drugDict1 = new DrugDict1();
        drugDict1.setIncrementId(0);
        drugDict1.setInsureDrugGrade("insureDrugGrade");
        drugDict1.setInsureDrugCode("insureDrugCode");
        drugDict1.setDrugChineseName("drugChineseName");
        drugDict1.setChargeItemCode("chargeItemCode");
        drugDict1.setDrugFactoryName("drugFactoryName");
        drugDict1.setDrugMinUnit("drugMinUnit");
        drugDict1.setInsureDrugSpec("insureDrugSpec");
        drugDict1.setDrugDosageForm("drugDosageForm");
        drugDict1.setDrugEnglishName("drugEnglishName");
        drugDict1.setSearchCode1("searchCode1");
        drugDict1.setSearchCode2("searchCode2");
        drugDict1.setUseStartTime("useStartTime");
        drugDict1.setUseEndTime("useEndTime");
        drugDict1.setDrugApproveNum("drugApproveNum");
        final List<DrugDict1> drugDict1s = Arrays.asList(drugDict1);
        when(mockPersonService.selectwowjoydrugdict()).thenReturn(drugDict1s);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoydrugdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatetwowjoydrugdict(0, "searchCode1");
    }

    @Test
    void testSelectwowjoyorderdict() throws Exception {
        // Setup
        // Configure PersonService.selectwowjoyorderdict(...).
        final OrderDict1 orderDict1 = new OrderDict1();
        orderDict1.setIncrementId(0);
        orderDict1.setInsureOrderGrade("insureOrderGrade");
        orderDict1.setInsureOrderCode("insureOrderCode");
        orderDict1.setOrderChineseName("orderChineseName");
        orderDict1.setChargeItemCode("chargeItemCode");
        orderDict1.setDrugFactoryName("drugFactoryName");
        orderDict1.setInsureOrderUnit("insureOrderUnit");
        orderDict1.setInsureDrugSpec("insureDrugSpec");
        orderDict1.setDrugDosageForm("drugDosageForm");
        orderDict1.setOrderEnglishName("orderEnglishName");
        orderDict1.setSearchCode1("searchCode1");
        orderDict1.setSearchCode2("searchCode2");
        orderDict1.setUseStartTime("useStartTime");
        orderDict1.setUseEndTime("useEndTime");
        orderDict1.setOrderApproveNum("orderApproveNum");
        final List<OrderDict1> orderDict1s = Arrays.asList(orderDict1);
        when(mockPersonService.selectwowjoyorderdict()).thenReturn(orderDict1s);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoyorderdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatetwowjoyorderdict(0, "searchCode1");
    }

    @Test
    void testSelectwowjoyorderdict_PersonServiceSelectwowjoyorderdictReturnsNoItems() throws Exception {
        // Setup
        when(mockPersonService.selectwowjoyorderdict()).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoyorderdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatetwowjoyorderdict(0, "searchCode1");
    }

    @Test
    void testSelectwowjoyorderdict_ThrowsException() throws Exception {
        // Setup
        // Configure PersonService.selectwowjoyorderdict(...).
        final OrderDict1 orderDict1 = new OrderDict1();
        orderDict1.setIncrementId(0);
        orderDict1.setInsureOrderGrade("insureOrderGrade");
        orderDict1.setInsureOrderCode("insureOrderCode");
        orderDict1.setOrderChineseName("orderChineseName");
        orderDict1.setChargeItemCode("chargeItemCode");
        orderDict1.setDrugFactoryName("drugFactoryName");
        orderDict1.setInsureOrderUnit("insureOrderUnit");
        orderDict1.setInsureDrugSpec("insureDrugSpec");
        orderDict1.setDrugDosageForm("drugDosageForm");
        orderDict1.setOrderEnglishName("orderEnglishName");
        orderDict1.setSearchCode1("searchCode1");
        orderDict1.setSearchCode2("searchCode2");
        orderDict1.setUseStartTime("useStartTime");
        orderDict1.setUseEndTime("useEndTime");
        orderDict1.setOrderApproveNum("orderApproveNum");
        final List<OrderDict1> orderDict1s = Arrays.asList(orderDict1);
        when(mockPersonService.selectwowjoyorderdict()).thenReturn(orderDict1s);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoyorderdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatetwowjoyorderdict(0, "searchCode1");
    }

    @Test
    void testSelectwowjoypubdict() throws Exception {
        // Setup
        // Configure PersonService.selectwowjoypubdict(...).
        final PubDict pubDict = new PubDict();
        pubDict.setIncrementId(0);
        pubDict.setId("id");
        pubDict.setDictBookId("dictBookId");
        pubDict.setInsureDictCode("insureDictCode");
        pubDict.setInsureDictName("insureDictName");
        pubDict.setOrgCode("orgCode");
        pubDict.setInsureItemRemark("insureItemRemark");
        pubDict.setDeleteFlag("deleteFlag");
        pubDict.setOrderby("orderby");
        pubDict.setSearchCode1("searchCode1");
        pubDict.setSearchCode2("searchCode2");
        pubDict.setSearchCode3("searchCode3");
        final List<PubDict> pubDicts = Arrays.asList(pubDict);
        when(mockPersonService.selectwowjoypubdict()).thenReturn(pubDicts);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoypubdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatetwowjoypubdict(0, "searchCode1");
    }

    @Test
    void testSelectwowjoypubdict_PersonServiceSelectwowjoypubdictReturnsNoItems() throws Exception {
        // Setup
        when(mockPersonService.selectwowjoypubdict()).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoypubdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatetwowjoypubdict(0, "searchCode1");
    }

    @Test
    void testSelectwowjoypubdict_ThrowsException() throws Exception {
        // Setup
        // Configure PersonService.selectwowjoypubdict(...).
        final PubDict pubDict = new PubDict();
        pubDict.setIncrementId(0);
        pubDict.setId("id");
        pubDict.setDictBookId("dictBookId");
        pubDict.setInsureDictCode("insureDictCode");
        pubDict.setInsureDictName("insureDictName");
        pubDict.setOrgCode("orgCode");
        pubDict.setInsureItemRemark("insureItemRemark");
        pubDict.setDeleteFlag("deleteFlag");
        pubDict.setOrderby("orderby");
        pubDict.setSearchCode1("searchCode1");
        pubDict.setSearchCode2("searchCode2");
        pubDict.setSearchCode3("searchCode3");
        final List<PubDict> pubDicts = Arrays.asList(pubDict);
        when(mockPersonService.selectwowjoypubdict()).thenReturn(pubDicts);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoypubdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatetwowjoypubdict(0, "searchCode1");
    }

    @Test
    void testQueryBaeReckonList() throws Exception {
        // Setup
        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/queryBaeReckonList")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).queryBaeReckonList();
    }

    @Test
    void testQueryBaeReckonList_ThrowsException() throws Exception {
        // Setup
        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/queryBaeReckonList")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).queryBaeReckonList();
    }

    @Test
    void testSelectwowjoyOtherdict() throws Exception {
        // Setup
        when(mockPersonService.selectwowjoyOtherdict()).thenReturn(Arrays.asList(new HashMap<>()));

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoyOtherdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatewowjoyOtherdict(0, "searchCode1");
    }

    @Test
    void testSelectwowjoyOtherdict_PersonServiceSelectwowjoyOtherdictReturnsNoItems() throws Exception {
        // Setup
        when(mockPersonService.selectwowjoyOtherdict()).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoyOtherdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatewowjoyOtherdict(0, "searchCode1");
    }

    @Test
    void testSelectwowjoyOtherdict_ThrowsException() throws Exception {
        // Setup
        when(mockPersonService.selectwowjoyOtherdict()).thenReturn(Arrays.asList(new HashMap<>()));

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoyOtherdict")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).updatewowjoyOtherdict(0, "searchCode1");
    }

    @Test
    void testHello() throws Exception {
        // Setup
        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/hello1")
                        .param("name", "name")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testSendPostDataByMap() throws Exception {
        // Setup
        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(post("/httpService/sendPostDataByMap")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testSendPostDataByJson() throws Exception {
        // Setup
        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(post("/httpService/sendPostDataByJson")
                        .content("content").contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testSendPostDataByMap2() throws Exception {
        // Setup
        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(post("/httpService/sendPostDataByMap2")
                        .content("content").contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testSendGetData() throws Exception {
        // Setup
        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/sendGetData")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testInsert() throws Exception {
        // Setup
        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/11")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).insert(any(Person.class));
    }

    @Test
    void testInsert_ThrowsException() throws Exception {
        // Setup
        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/11")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).insert(any(Person.class));
    }

    @Test
    void testInsert12() throws Exception {
        // Setup
        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/12")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).insertDrugDict();
    }

    @Test
    void testInsert12_ThrowsException() throws Exception {
        // Setup
        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/12")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).insertDrugDict();
    }

    @Test
    void testSelectwowjoytest() throws Exception {
        // Setup
        when(mockPersonService.selecttest()).thenReturn(Arrays.asList("value"));

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoytest")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testSelectwowjoytest_PersonServiceReturnsNoItems() throws Exception {
        // Setup
        when(mockPersonService.selecttest()).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoytest")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testSelectwowjoytest_ThrowsException() throws Exception {
        // Setup
        when(mockPersonService.selecttest()).thenReturn(Arrays.asList("value"));

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/selectwowjoytest")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testImportExcel() throws Exception {
        // Setup
        when(mockPersonService.impxlsx(
                "C:\\\\Users\\\\13735\\\\Desktop\\\\郑州市第三人民医院出差发票\\\\busyTransInfo.xlsx")).thenReturn("result");

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/httpService/import")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        verify(mockPersonService).impxlsx("C:\\\\Users\\\\13735\\\\Desktop\\\\郑州市第三人民医院出差发票\\\\busyTransInfo.xlsx");
    }
}
