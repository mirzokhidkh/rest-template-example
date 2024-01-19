package com.example.resttemplatedemo.model.epolis;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class EPolisModel{
	private String aGENTID;
	private String cLIENTADDRESS;
	private String cLIENTNAME;
	private String cLIENTPHONE;
	private String pRODUCTID;
	private String oBJECT;
	private int cREDITID;
	private String pASSWORD;
	private String bENEFICIARYNAME;
	private String pERIODEND;
	private String uSERNAME;
	private String cLIENTPASSPORT;
	private int aGENTPHONE;
	private int iNSURANCECOST;
	private String tRANSACTIONID;
	private String pERIODBEGIN;
}