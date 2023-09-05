package com.example.resttemplatedemo.test;

import com.example.resttemplatedemo.model.crif.schemes.MGResponse;
import com.example.resttemplatedemo.model.crif.schemes.MessageIdempotence;
import com.example.resttemplatedemo.model.crif.schemes.MessageResponse;
import com.example.resttemplatedemo.model.gcp.schemes.CEPResponse;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class Test {


    public static String getMGResponseStringXml(){
        return "<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <s:Body xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n" +
                "        <MGResponse xmlns=\"urn:cbs-messagegatewaysoap:2015-01-01\">\n" +
                "            <MessageResponse GroupId=\"b54c2e5a-e99b-467b-98c8-f8b5553e2e11\" Id=\"a2fbe3d6-a084-41a5-a973-bf0d09fca031\" TimeStamp=\"2016-01-28T23:55:25.7523188+05:00\" Idempotence=\"unique\" ExpirationTimeStamp=\"2023-07-13T06:08:29.560331Z\" ResultLanguage=\"en-US\" ResultCode=\"S\" ResultDescription=\"Success.\">\n" +
                "                <CredentialsResponse Domain=\"\" Id=\"PIGY9962\" Password=\"********\" ResultLanguage=\"en-US\" ResultCode=\"S\" ResultDescription=\"Success.\"/>\n" +
                "            </MessageResponse>\n" +
                "            <ProductResponse ServiceId=\"CBG\" Id=\"CB_NAE_Product\" Version=\"CB_NAE_Product.2023-06-16.001\" ResultLanguage=\"en-US\" ResultCode=\"S\" ResultDescription=\"Success.\">\n" +
                "                <cb:CB_NAE_ProductOutput xmlns:cb=\"urn:crif-creditbureau:v1\">\n" +
                "                    <cb:MessageId CBSMessageId=\"a2fbe3d6-a084-41a5-a973-bf0d09fca031\" CBSLogUID=\"b1558b06-69ba-45a3-882e-364ef6577d5b\"/>\n" +
                "                    <cb:Error Code=\"1-089\" Description=\"THE SUBJECT IS ALREADY LINKED TO THE CONTRACT\"/>\n" +
                "                </cb:CB_NAE_ProductOutput>\n" +
                "            </ProductResponse>\n" +
                "        </MGResponse>\n" +
                "    </s:Body>\n" +
                "</s:Envelope>";
    }



    public static MGResponse getMGResponse() throws DatatypeConfigurationException {
        MGResponse mgResponse = new MGResponse();
        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setGroupId("b54c2e5a-e99b-467b-98c8-f8b5553e2e11");
        messageResponse.setId("a2fbe3d6-a084-41a5-a973-bf0d09fca031");
        messageResponse.setTimeStamp(getXmlGregorianCalendarByZoneDateTime("2016-01-28T19:55:25.7523188+01:00"));
        messageResponse.setIdempotence(MessageIdempotence.UNIQUE);
        mgResponse.setMessageResponse(messageResponse);

        return mgResponse;
    }

    public static XMLGregorianCalendar getXmlGregorianCalendarByZoneDateTime(String date) throws DatatypeConfigurationException {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(date);
        GregorianCalendar gregorianCalendar = GregorianCalendar.from(zonedDateTime);
        XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        return xmlGregorianCalendar;
    }


    @NotNull
    public static String getSoapXmlCepResponse() {
        return "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "   <env:Header/>\n" +
                "   <env:Body>\n" +
                "      <CEPResponse xmlns=\"http://fido.com/EasuEGServices\">\n" +
                "         <Result>1</Result>\n" +
                "         <Data><![CDATA[<?xml version=\"1.0\"?>\n" +
                "<datacepresponse>\n" +
                "<row>\n" +
                "<document>*********</document>\n" +
                "<surname_latin>TEST</surname_latin>\n" +
                "<name_latin>TEST</name_latin>\n" +
                "<patronym_latin>TEST</patronym_latin>\n" +
                "<surname_engl/>\n" +
                "<name_engl/>\n" +
                "<birth_date>1988-06-05</birth_date>\n" +
                "<birth_place>TOSHKENT</birth_place>\n" +
                "<birth_place_id/>\n" +
                "<birth_country>ЎЗБЕКИСТОН</birth_country>\n" +
                "<birth_country_id>182</birth_country_id>\n" +
                "<livestatus>1</livestatus>\n" +
                "<nationality>ЎЗБЕК</nationality>\n" +
                "<nationality_id>44</nationality_id>\n" +
                "<citizenship>ЎЗБЕКИСТОН</citizenship>\n" +
                "<citizenship_id>182</citizenship_id>\n" +
                "<sex>1</sex>\n" +
                "<doc_give_place>ТОШКЕНТ ШАҲАР ЯККАСАРОЙ ТУМАНИ ИИБ</doc_give_place>\n" +
                "<doc_give_place_id>26287</doc_give_place_id>\n" +
                "<date_begin_document>2022-22-04</date_begin_document>\n" +
                "<date_end_document>2032-21-04</date_end_document>\n" +
                "</row>\n" +
                "</datacepresponse>]]></Data>\n" +
                "         <Comments/>\n" +
                "      </CEPResponse>\n" +
                "   </env:Body>\n" +
                "</env:Envelope>";
    }



    public static CEPResponse getResponseXml() {
        CEPResponse cepResponse = new CEPResponse();
        cepResponse.setResult("1");
        cepResponse.setComments("");
        cepResponse.setData("<![CDATA[<?xml version=\"1.0\"?>\n" +
                "<datacepresponse>\n" +
                "<row>\n" +
                "<document>*********</document>\n" +
                "<surname_latin>TEST</surname_latin>\n" +
                "<name_latin>TEST</name_latin>\n" +
                "<patronym_latin>TEST</patronym_latin>\n" +
                "<surname_engl/>\n" +
                "<name_engl/>\n" +
                "<birth_date>1988-06-05</birth_date>\n" +
                "<birth_place>TOSHKENT</birth_place>\n" +
                "<birth_place_id/>\n" +
                "<birth_country>ЎЗБЕКИСТОН</birth_country>\n" +
                "<birth_country_id>182</birth_country_id>\n" +
                "<livestatus>1</livestatus>\n" +
                "<nationality>ЎЗБЕК</nationality>\n" +
                "<nationality_id>44</nationality_id>\n" +
                "<citizenship>ЎЗБЕКИСТОН</citizenship>\n" +
                "<citizenship_id>182</citizenship_id>\n" +
                "<sex>1</sex>\n" +
                "<doc_give_place>ТОШКЕНТ ШАҲАР ЯККАСАРОЙ ТУМАНИ ИИБ</doc_give_place>\n" +
                "<doc_give_place_id>26287</doc_give_place_id>\n" +
                "<date_begin_document>2022-22-04</date_begin_document>\n" +
                "<date_end_document>2032-21-04</date_end_document>\n" +
                "</row>\n" +
                "</datacepresponse>]]>");

        return cepResponse;
    }


    public static String getCEPResponseStringXMl(){
        return "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <env:Header/>\n" +
                "    <env:Body>\n" +
                "        <GetDataByPinppResponse xmlns=\"http://fido.com/EasuEGServices\">\n" +
                "            <Result>1</Result>\n" +
                "            <Data>&lt;?xml version=\"1.0\"?>\n" +
                "&lt;personaldata>\n" +
                "&lt;row>\n" +
                "&lt;queryld>string&lt;/queryld>\n" +
                "&lt;pinpp>30606985630033&lt;/pinpp>\n" +
                "&lt;document>AB0557972&lt;/document>\n" +
                "&lt;surnamelatin>ZIYADULLAYEV&lt;/surnamelatin>\n" +
                "&lt;namelatin>AZAMAT&lt;/namelatin>\n" +
                "&lt;patronymlatin>XOLMUMIN O‘G‘LI&lt;/patronymlatin>\n" +
                "&lt;engsurname>ZIYADULLAEV&lt;/engsurname>\n" +
                "&lt;engname>AZAMAT&lt;/engname>\n" +
                "&lt;birth_date>1998-06-06&lt;/birth_date>\n" +
                "&lt;birthplace>QAMASHI TUMANI&lt;/birthplace>\n" +
                "&lt;birthplaceid/>\n" +
                "&lt;birthcountry>УЗБЕКИСТАН&lt;/birthcountry>\n" +
                "&lt;birthcountryid>182&lt;/birthcountryid>\n" +
                "&lt;livestatus>1&lt;/livestatus>\n" +
                "&lt;nationality>УЗБЕК/УЗБЕЧКА&lt;/nationality>\n" +
                "&lt;nationalityid>44&lt;/nationalityid>\n" +
                "&lt;citizenship>УЗБЕКИСТАН&lt;/citizenship>\n" +
                "&lt;citizenshipid>182&lt;/citizenshipid>\n" +
                "&lt;sex>1&lt;/sex>\n" +
                "&lt;docgiveplace>КАМАШИНСКИЙ РОВД КАШКАДАРЬИНСКОЙ ОБЛАСТИ&lt;/docgiveplace>\n" +
                "&lt;docgiveplaceid>10220&lt;/docgiveplaceid>\n" +
                "&lt;docdatebegin>2015-07-31&lt;/docdatebegin>\n" +
                "&lt;docdateend>2025-07-30&lt;/docdateend>\n" +
                "&lt;/row>\n" +
                "&lt;/personaldata></Data>\n" +
                "        <Comments/>\n" +
                "    </GetDataByPinppResponse>\n" +
                "</env:Body>\n" +
                "</env:Envelope>";
    }


    public static String GetDataByDocResponseStringXMl(){
        return "<?xml version='1.0' encoding='UTF-8'?><env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <env:Header/>\n" +
                "    <env:Body>\n" +
                "        <GetDataByDocResponse xmlns=\"http://fido.com/EasuEGServices\">\n" +
                "            <Result>1</Result>\n" +
                "            <Data>&lt;?xml version=\"1.0\"?>\n" +
                "&lt;personaldata>\n" +
                "&lt;row>\n" +
                "&lt;queryld>string&lt;/queryld>\n" +
                "&lt;pinpp>30606985630033&lt;/pinpp>\n" +
                "&lt;document>AB0557972&lt;/document>\n" +
                "&lt;surnamelatin>ZIYADULLAYEV&lt;/surnamelatin>\n" +
                "&lt;namelatin>AZAMAT&lt;/namelatin>\n" +
                "&lt;patronymlatin>XOLMUMIN O‘G‘LI&lt;/patronymlatin>\n" +
                "&lt;engsurname>ZIYADULLAEV&lt;/engsurname>\n" +
                "&lt;engname>AZAMAT&lt;/engname>\n" +
                "&lt;birth_date>1998-06-06&lt;/birth_date>\n" +
                "&lt;birthplace>QAMASHI TUMANI&lt;/birthplace>\n" +
                "&lt;birthplaceid/>\n" +
                "&lt;birthcountry>УЗБЕКИСТАН&lt;/birthcountry>\n" +
                "&lt;birthcountryid>182&lt;/birthcountryid>\n" +
                "&lt;livestatus>1&lt;/livestatus>\n" +
                "&lt;nationality>УЗБЕК/УЗБЕЧКА&lt;/nationality>\n" +
                "&lt;nationalityid>44&lt;/nationalityid>\n" +
                "&lt;citizenship>УЗБЕКИСТАН&lt;/citizenship>\n" +
                "&lt;citizenshipid>182&lt;/citizenshipid>\n" +
                "&lt;sex>1&lt;/sex>\n" +
                "&lt;docgiveplace>КАМАШИНСКИЙ РОВД КАШКАДАРЬИНСКОЙ ОБЛАСТИ&lt;/docgiveplace>\n" +
                "&lt;docgiveplaceid>10220&lt;/docgiveplaceid>\n" +
                "&lt;docdatebegin>2015-07-31&lt;/docdatebegin>\n" +
                "&lt;docdateend>2025-07-30&lt;/docdateend>\n" +
                "&lt;/row>\n" +
                "&lt;/personaldata></Data>\n" +
                "        <Comments/>\n" +
                "    </GetDataByDocResponse>\n" +
                "</env:Body>\n" +
                "</env:Envelope>";
    }


    public static  String getPersonAddressData1(){
        return "{\n" +
                "    \"Data\": {\n" +
                "        \"PermanentRegistration\": null,\n" +
                "        \"TemproaryRegistrations\": null\n" +
                "    },\n" +
                "    \"AnswereId\": 1,\n" +
                "    \"AnswereMessage\": \"Ok\",\n" +
                "    \"AnswereComment\": \"\"\n" +
                "}";
    }
 public static  String getPersonAddressData2(){
        return "{\n" +
                "    \"AnswereId\": 5,\n" +
                "    \"AnswereMessage\": \"ЖШШР: 30410785050012 топилмади\",\n" +
                "    \"AnswereComment\": \"Берилган ЖШШР: 30410785050012 бўйича маълумотлар топилмади\"\n" +
                "}";
    }

    public static String getPersonAddressData(){
        return "{\n" +
                "  \"Data\": {\n" +
                "    \"PermanentRegistration\": {\n" +
                "      \"Cadastre\": \"10:04:06:03:02:5067:0001:024\",\n" +
                "      \"Country\": {\n" +
                "        \"Id\": 182,\n" +
                "        \"Value\": \"ЎЗБЕКИСТОН\",\n" +
                "        \"IdValue\": \"(182) ЎЗБЕКИСТОН\"\n" +
                "      },\n" +
                "      \"Region\": {\n" +
                "        \"Id\": 10,\n" +
                "        \"Value\": \"ТОШКЕНТ ШАҲРИ\",\n" +
                "        \"IdValue\": \"(10) ТОШКЕНТ ШАҲРИ\"\n" +
                "      },\n" +
                "      \"District\": {\n" +
                "        \"Id\": 739001080,\n" +
                "        \"Value\": \"ЯШНОБОД ТУМАНИ\",\n" +
                "        \"IdValue\": \"(739001080) ЯШНОБОД ТУМАНИ\"\n" +
                "      },\n" +
                "      \"Address\": \"Илтифот МФЙ, 58-Военный городок мавзеси, 45-уй, 24-хонадон\",\n" +
                "      \"RegistrationDate\": \"2022-12-29T00:00:00\"\n" +
                "    },\n" +
                "    \"TemproaryRegistrations\": [\n" +
                "      {\n" +
                "        \"Cadastre\": \"10:09:05:01:01:5295/14\",\n" +
                "        \"Country\": null,\n" +
                "        \"Region\": {\n" +
                "          \"Id\": 10,\n" +
                "          \"Value\": \"TOSHKENT SHAHRI\",\n" +
                "          \"IdValue\": \"(10) TOSHKENT SHAHRI\"\n" +
                "        },\n" +
                "        \"District\": {\n" +
                "          \"Id\": 1003,\n" +
                "          \"Value\": \"MIRZO ULUG‘BEK TUMANI\",\n" +
                "          \"IdValue\": \"(1003) MIRZO ULUG‘BEK TUMANI\"\n" +
                "        },\n" +
                "        \"Address\": \"ЯЛАНҒОЧ МФЙ, БУЮК ИПАК ЙУЛИ КЎЧАСИ,  uy:374/7А\",\n" +
                "        \"DateFrom\": \"2020-07-01T11:22:30\",\n" +
                "        \"DateTill\": \"2021-07-01T11:22:30\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"Cadastre\": \"10:09:05:01:01:5295/14\",\n" +
                "        \"Country\": null,\n" +
                "        \"Region\": {\n" +
                "          \"Id\": 10,\n" +
                "          \"Value\": \"TOSHKENT SHAHRI\",\n" +
                "          \"IdValue\": \"(10) TOSHKENT SHAHRI\"\n" +
                "        },\n" +
                "        \"District\": {\n" +
                "          \"Id\": 1003,\n" +
                "          \"Value\": \"MIRZO ULUG‘BEK TUMANI\",\n" +
                "          \"IdValue\": \"(1003) MIRZO ULUG‘BEK TUMANI\"\n" +
                "        },\n" +
                "        \"Address\": \"г. Ташкент, Мирзо Улугбекский район, ул. Буюк Ипак Йули, Ялангоч МСГ, 374/7а- Дом, -\",\n" +
                "        \"DateFrom\": \"2022-04-20T00:00:00\",\n" +
                "        \"DateTill\": \"2023-04-20T00:00:00\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"AnswereId\": 1,\n" +
                "  \"AnswereMessage\": \"Ok\",\n" +
                "  \"AnswereComment\": \"\"\n" +
                "}\n";
    }


    public static  String getIndividualJson(){
        return "{\n" +
                "    \"document_type\": 1,\n" +
                "    \"passport_serial\": \"AD3957911\",\n" +
                "    \"firstname\": \"JAMILA\",\n" +
                "    \"lastname\": \"AMANBAEVA\",\n" +
                "    \"middlename\": \"MURATBAEVNA\",\n" +
                "    \"home_region\": null,\n" +
                "    \"home_subregion\": null,\n" +
                "    \"home_address\": null,\n" +
                "    \"registration_address_region_soato\": null,\n" +
                "    \"registration_address_sub_region_soato\": null,\n" +
                "    \"activity_region\": 1735,\n" +
                "    \"activity_subregion\": 1735401,\n" +
                "    \"activity_address\": \"JIPEK JOLI KO`CHASI 1-UY 6-MAGAZIN  \",\n" +
                "    \"activity_type_id\": 9,\n" +
                "    \"activity_type_name_uz\": \"Oziq-ovqat va nooziq-ovqat tovarlari bilan chakana savdo qilish (qurilish materiallari, sement, shifer, yog‘och va yog‘och mahsulotlari, alkogolli va tamaki mahsulotlari, neft mahsulotlarining barcha turlari, qimmatbaho metallar va qimmatbaho toshlardan yasalgan buyumlar yoxud bunday materiallar qo‘llanilgan buyumlar, audiovizual asarlar, fonogrammalar va EHM uchun yaratilgan dasturlar, yangi import avtomobillar, farmatsevtika tovarlarini sotish bundan mustasno)\",\n" +
                "    \"pin\": \"40407883500025\",\n" +
                "    \"official_registration_date\": \"06.07.2021\",\n" +
                "    \"certificate_number\": \"1423418\",\n" +
                "    \"registry_number\": \"1423418\",\n" +
                "    \"active_till\": \"\"\n" +
                "}\n";
    }


    public static  String getLegalJson(){
        return "{\n" +
                "    \"name\": \"\\\"TEST UCHUN\\\" Xususiy korxona\",\n" +
                "    \"shortname\": \"\\\"TEST UCHUN\\\" XK\",\n" +
                "    \"le_status\": 0,\n" +
                "    \"official_registration_date\": \"12.01.2010\",\n" +
                "    \"certificate_number\": \"1\",\n" +
                "    \"registry_number\": \"1\",\n" +
                "    \"tin\": 123456789,\n" +
                "    \"opf\": 110,\n" +
                "    \"home_region\": null,\n" +
                "    \"home_subregion\": null,\n" +
                "    \"home_address\": null\n" +
                "}";
    }


    public static  String getPassportDataJson(){
        return "{\n" +
                "    \"result\": \"1\",\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"transaction_id\": 115230,\n" +
                "            \"current_pinpp\": \"32605900261679\",\n" +
                "            \"pinpps\": [\n" +
                "                \"32605900261679\"\n" +
                "            ],\n" +
                "            \"current_document\": \"AA9004440\",\n" +
                "            \"documents\": [\n" +
                "                {\n" +
                "                    \"document\": \"FA7483369\",\n" +
                "                    \"type\": \"IDMS_RECV_IP_DOCUMENTS\",\n" +
                "                    \"docgiveplace\": \"ЧИЛАНЗАРСКИЙ РУВД ГОРОДА ТАШКЕНТА\",\n" +
                "                    \"docgiveplaceid\": 26294,\n" +
                "                    \"datebegin\": \"2023-03-29\",\n" +
                "                    \"dateend\": \"2033-03-28\",\n" +
                "                    \"status\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"document\": \"AA9004440\",\n" +
                "                    \"type\": \"IDMS_RECV_CITIZ_DOCUMENTS\",\n" +
                "                    \"docgiveplace\": \"ЧИЛАНЗАРСКИЙ РУВД ГОРОДА ТАШКЕНТА\",\n" +
                "                    \"docgiveplaceid\": 26294,\n" +
                "                    \"datebegin\": \"2015-03-13\",\n" +
                "                    \"dateend\": \"2025-03-12\",\n" +
                "                    \"status\": 2\n" +
                "                }\n" +
                "            ],\n" +
                "            \"surnamelat\": \"ERMATOV\",\n" +
                "            \"namelat\": \"BAXROM\",\n" +
                "            \"patronymlat\": \"RAXMANOVICH\",\n" +
                "            \"surnamecyr\": \"ЭРМАТОВ\",\n" +
                "            \"namecyr\": \"БАХРОМ\",\n" +
                "            \"patronymcyr\": \"РАХМАНОВИЧ\",\n" +
                "            \"engsurname\": \"ERMATOV\",\n" +
                "            \"engname\": \"BAKHROM\",\n" +
                "            \"birth_date\": \"1990-05-26\",\n" +
                "            \"birthplace\": null,\n" +
                "            \"birthcountry\": \"УЗБЕКИСТАН\",\n" +
                "            \"birthcountryid\": 182,\n" +
                "            \"livestatus\": 1,\n" +
                "            \"nationality\": \"УЗБЕК/УЗБЕЧКА\",\n" +
                "            \"nationalityid\": 44,\n" +
                "            \"citizenship\": \"УЗБЕКИСТАН\",\n" +
                "            \"citizenshipid\": 182,\n" +
                "            \"sex\": 1\n" +
                "        }\n" +
                "    ],\n" +
                "    \"comments\": \"\"\n" +
                "}\n";
    }




}
