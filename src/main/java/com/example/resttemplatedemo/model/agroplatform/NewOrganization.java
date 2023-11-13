package com.example.resttemplatedemo.model.agroplatform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewOrganization {

	@JsonProperty("query_id")
	private int queryId;

	//bank MFO
	//Мижозга хизмат курсатувчи банк коди
	@JsonProperty("client_branch")
	private String clientBranch;

	//Мижознинг оферта шартномаси файли
	@JsonProperty("offer_agreement_file_url")
	private String offerAgreementFileUrl;

	//So’rov berilgan sana
	@JsonProperty("query_date")
	private String queryDate;

	@JsonProperty("inn")
	private String inn;

//	bank HISOB RAQAMI
	@JsonProperty("client")
	private String client;

//	Ro’yhatdan o’tgan sana
	@JsonProperty("dial_d")
	private String dialD;

	//Мижознинг оферта шартномаси рақами
	@JsonProperty("dial_num")
	private int dialNum;

	public void setQueryId(int queryId){
		this.queryId = queryId;
	}

	public int getQueryId(){
		return queryId;
	}

	public void setClientBranch(String clientBranch){
		this.clientBranch = clientBranch;
	}

	public String getClientBranch(){
		return clientBranch;
	}

	public void setOfferAgreementFileUrl(String offerAgreementFileUrl){
		this.offerAgreementFileUrl = offerAgreementFileUrl;
	}

	public String getOfferAgreementFileUrl(){
		return offerAgreementFileUrl;
	}

	public void setQueryDate(String queryDate){
		this.queryDate = queryDate;
	}

	public String getQueryDate(){
		return queryDate;
	}

	public void setInn(String inn){
		this.inn = inn;
	}

	public String getInn(){
		return inn;
	}

	public void setClient(String client){
		this.client = client;
	}

	public String getClient(){
		return client;
	}

	public void setDialD(String dialD){
		this.dialD = dialD;
	}

	public String getDialD(){
		return dialD;
	}

	public void setDialNum(int dialNum){
		this.dialNum = dialNum;
	}

	public int getDialNum(){
		return dialNum;
	}

	@Override
 	public String toString(){
		return 
			"NewOrganization{" + 
			"query_id = '" + queryId + '\'' + 
			",client_branch = '" + clientBranch + '\'' + 
			",offer_agreement_file_url = '" + offerAgreementFileUrl + '\'' + 
			",query_date = '" + queryDate + '\'' + 
			",inn = '" + inn + '\'' + 
			",client = '" + client + '\'' + 
			",dial_d = '" + dialD + '\'' + 
			",dial_num = '" + dialNum + '\'' + 
			"}";
		}
}