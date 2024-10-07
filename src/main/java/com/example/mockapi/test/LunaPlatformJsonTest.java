package com.example.mockapi.test;

public class LunaPlatformJsonTest {

    public static String getHandlerEvent() {
        return "{\n" + "    \"images\": [\n" + "        {\n" + "            \"filename\": \"WIN_20231225_10_55_53_Pro.jpg\",\n" + "            \"status\": 1,\n" + "            \"error\": {\n" + "                \"error_code\": 0,\n" + "                \"desc\": \"Success\",\n" + "                \"detail\": \"Success\",\n" + "                \"link\": \"https://docs.visionlabs.ai/info/luna/troubleshooting/errors-description/code-0\"\n" + "            },\n" + "            \"image_estimations\": {}\n" + "        }\n" + "    ],\n" + "    \"events\": [\n" + "        {\n" + "            \"event_id\": \"02e997aa-a7bd-4cf6-8f4f-a072a4643d56\",\n" + "            \"url\": \"/6/events/02e997aa-a7bd-4cf6-8f4f-a072a4643d56\",\n" + "            \"detections\": [\n" + "                {\n" + "                    \"filename\": \"WIN_20231225_10_55_53_Pro.jpg\",\n" + "                    \"samples\": {\n" + "                        \"face\": {\n" + "                            \"detection\": {\n" + "                                \"rect\": {\n" + "                                    \"x\": 923,\n" + "                                    \"y\": 677,\n" + "                                    \"width\": 235,\n" + "                                    \"height\": 333\n" + "                                },\n" + "                                \"landmarks5\": [\n" + "                                    [\n" + "                                        56,\n" + "                                        109\n" + "                                    ],\n" + "                                    [\n" + "                                        164,\n" + "                                        107\n" + "                                    ],\n" + "                                    [\n" + "                                        108,\n" + "                                        175\n" + "                                    ],\n" + "                                    [\n" + "                                        68,\n" + "                                        239\n" + "                                    ],\n" + "                                    [\n" + "                                        156,\n" + "                                        239\n" + "                                    ]\n" + "                                ],\n" + "                                \"quality\": {\n" + "                                    \"blurriness\": 0.967434287071228,\n" + "                                    \"dark\": 0.9278554320335388,\n" + "                                    \"illumination\": 0.7964142560958862,\n" + "                                    \"specularity\": 0.9176583290100098,\n" + "                                    \"light\": 0.915543258190155\n" + "                                },\n" + "                                \"attributes\": {\n" + "                                    \"head_pose\": {\n" + "                                        \"pitch\": 4.523502826690674,\n" + "                                        \"roll\": -2.281925678253174,\n" + "                                        \"yaw\": 0.9767045974731445\n" + "                                    }\n" + "                                }\n" + "                            },\n" + "                            \"sample_id\": \"29605dee-cf94-476e-88af-2336101dd534\",\n" + "                            \"url\": \"/6/samples/faces/29605dee-cf94-476e-88af-2336101dd534\"\n" + "                        },\n" + "                        \"body\": null\n" + "                    },\n" + "                    \"detect_time\": \"2023-12-27T14:52:49.885442+05:00\",\n" + "                    \"detect_ts\": null,\n" + "                    \"image_origin\": null\n" + "                }\n" + "            ],\n" + "            \"face_attributes\": {\n" + "                \"attribute_id\": null,\n" + "                \"url\": null,\n" + "                \"samples\": [\n" + "                    \"29605dee-cf94-476e-88af-2336101dd534\"\n" + "                ],\n" + "                \"score\": 0.9959810972213745,\n" + "                \"basic_attributes\": {\n" + "                    \"ethnicities\": {\n" + "                        \"predominant_ethnicity\": \"caucasian\",\n" + "                        \"estimations\": {\n" + "                            \"asian\": 1.1828436981886625e-5,\n" + "                            \"indian\": 1.8390373952570371e-6,\n" + "                            \"caucasian\": 0.9999351501464844,\n" + "                            \"african_american\": 5.1226998039055616e-5\n" + "                        }\n" + "                    },\n" + "                    \"age\": 26,\n" + "                    \"gender\": 1\n" + "                }\n" + "            },\n" + "            \"body_attributes\": null,\n" + "            \"aggregate_estimations\": {\n" + "                \"face\": {\n" + "                    \"attributes\": {}\n" + "                },\n" + "                \"body\": {\n" + "                    \"attributes\": {}\n" + "                }\n" + "            },\n" + "            \"matches\": [\n" + "                {\n" + "                    \"label\": \"Постоянные клиенты\",\n" + "                    \"candidates\": [\n" + "                        {\n" + "                            \"face\": {\n" + "                                \"face_id\": \"4ac51f44-ee72-434f-b2e8-c6e9d428d876\"\n" + "                            },\n" + "                            \"similarity\": 1.0\n" + "                        },\n" + "                        {\n" + "                            \"face\": {\n" + "                                \"face_id\": \"e22c8512-bf97-452b-b2fa-5886150fb76c\"\n" + "                            },\n" + "                            \"similarity\": 0.9999517202377319\n" + "                        }\n" + "                    ]\n" + "                }\n" + "            ],\n" + "            \"face\": {\n" + "                \"face_id\": \"f503616c-05ad-4de5-89aa-9f94383f133d\",\n" + "                \"url\": \"/6/faces/f503616c-05ad-4de5-89aa-9f94383f133d\",\n" + "                \"event_id\": \"02e997aa-a7bd-4cf6-8f4f-a072a4643d56\",\n" + "                \"user_data\": \"\",\n" + "                \"external_id\": \"\",\n" + "                \"avatar\": \"/6/samples/faces/29605dee-cf94-476e-88af-2336101dd534\",\n" + "                \"lists\": []\n" + "            },\n" + "            \"source\": null,\n" + "            \"tags\": [\n" + "                \"Постоянный клиент\"\n" + "            ],\n" + "            \"user_data\": \"\",\n" + "            \"external_id\": \"\",\n" + "            \"location\": {},\n" + "            \"track_id\": null,\n" + "            \"meta\": null\n" + "        }\n" + "    ],\n" + "    \"filtered_detections\": {\n" + "        \"face_detections\": []\n" + "    }\n" + "}";
    }

}