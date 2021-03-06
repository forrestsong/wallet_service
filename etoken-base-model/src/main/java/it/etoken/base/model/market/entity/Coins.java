package it.etoken.base.model.market.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coins implements Serializable{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.id
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.name
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.createdate
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private Date createdate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.modifydate
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private Date modifydate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.site
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String site;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.intr
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String intr;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.img
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String img;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.tag
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String tag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.total
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private Long total;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.marke
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private Long marke;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.code
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.symble
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String symble;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.contract_account
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String contractAccount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.is_support_market
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String isSupportMarket;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.precision_number
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private Integer precisionNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.issue_date
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private Date issueDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.crowdfunding_price
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String crowdfundingPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.white_paper_url
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String whitePaperUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.block_query_url
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String blockQueryUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.recommend_level
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private Integer recommendLevel;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.project_creative
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String projectCreative;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.investment_value
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String investmentValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.crowdfunding_date
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String crowdfundingDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column coins.exchange
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	private String exchange;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.id
	 * @return  the value of coins.id
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.id
	 * @param id  the value for coins.id
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.name
	 * @return  the value of coins.name
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.name
	 * @param name  the value for coins.name
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.createdate
	 * @return  the value of coins.createdate
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public Date getCreatedate() {
		return createdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.createdate
	 * @param createdate  the value for coins.createdate
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.modifydate
	 * @return  the value of coins.modifydate
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public Date getModifydate() {
		return modifydate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.modifydate
	 * @param modifydate  the value for coins.modifydate
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.site
	 * @return  the value of coins.site
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getSite() {
		return site;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.site
	 * @param site  the value for coins.site
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.intr
	 * @return  the value of coins.intr
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getIntr() {
		return intr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.intr
	 * @param intr  the value for coins.intr
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setIntr(String intr) {
		this.intr = intr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.img
	 * @return  the value of coins.img
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getImg() {
		return img;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.img
	 * @param img  the value for coins.img
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.tag
	 * @return  the value of coins.tag
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.tag
	 * @param tag  the value for coins.tag
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.total
	 * @return  the value of coins.total
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public Long getTotal() {
		return total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.total
	 * @param total  the value for coins.total
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setTotal(Long total) {
		this.total = total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.marke
	 * @return  the value of coins.marke
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public Long getMarke() {
		return marke;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.marke
	 * @param marke  the value for coins.marke
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setMarke(Long marke) {
		this.marke = marke;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.code
	 * @return  the value of coins.code
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.code
	 * @param code  the value for coins.code
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.symble
	 * @return  the value of coins.symble
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getSymble() {
		return symble;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.symble
	 * @param symble  the value for coins.symble
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setSymble(String symble) {
		this.symble = symble;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.contract_account
	 * @return  the value of coins.contract_account
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getContractAccount() {
		return contractAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.contract_account
	 * @param contractAccount  the value for coins.contract_account
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setContractAccount(String contractAccount) {
		this.contractAccount = contractAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.is_support_market
	 * @return  the value of coins.is_support_market
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getIsSupportMarket() {
		return isSupportMarket;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.is_support_market
	 * @param isSupportMarket  the value for coins.is_support_market
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setIsSupportMarket(String isSupportMarket) {
		this.isSupportMarket = isSupportMarket;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.precision_number
	 * @return  the value of coins.precision_number
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public Integer getPrecisionNumber() {
		return precisionNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.precision_number
	 * @param precisionNumber  the value for coins.precision_number
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setPrecisionNumber(Integer precisionNumber) {
		this.precisionNumber = precisionNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.issue_date
	 * @return  the value of coins.issue_date
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public Date getIssueDate() {
		return issueDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.issue_date
	 * @param issueDate  the value for coins.issue_date
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.crowdfunding_price
	 * @return  the value of coins.crowdfunding_price
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getCrowdfundingPrice() {
		return crowdfundingPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.crowdfunding_price
	 * @param crowdfundingPrice  the value for coins.crowdfunding_price
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setCrowdfundingPrice(String crowdfundingPrice) {
		this.crowdfundingPrice = crowdfundingPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.white_paper_url
	 * @return  the value of coins.white_paper_url
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getWhitePaperUrl() {
		return whitePaperUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.white_paper_url
	 * @param whitePaperUrl  the value for coins.white_paper_url
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setWhitePaperUrl(String whitePaperUrl) {
		this.whitePaperUrl = whitePaperUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.block_query_url
	 * @return  the value of coins.block_query_url
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getBlockQueryUrl() {
		return blockQueryUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.block_query_url
	 * @param blockQueryUrl  the value for coins.block_query_url
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setBlockQueryUrl(String blockQueryUrl) {
		this.blockQueryUrl = blockQueryUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.recommend_level
	 * @return  the value of coins.recommend_level
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public Integer getRecommendLevel() {
		return recommendLevel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.recommend_level
	 * @param recommendLevel  the value for coins.recommend_level
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setRecommendLevel(Integer recommendLevel) {
		this.recommendLevel = recommendLevel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.project_creative
	 * @return  the value of coins.project_creative
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getProjectCreative() {
		return projectCreative;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.project_creative
	 * @param projectCreative  the value for coins.project_creative
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setProjectCreative(String projectCreative) {
		this.projectCreative = projectCreative;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.investment_value
	 * @return  the value of coins.investment_value
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getInvestmentValue() {
		return investmentValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.investment_value
	 * @param investmentValue  the value for coins.investment_value
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setInvestmentValue(String investmentValue) {
		this.investmentValue = investmentValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.crowdfunding_date
	 * @return  the value of coins.crowdfunding_date
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getCrowdfundingDate() {
		return crowdfundingDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.crowdfunding_date
	 * @param crowdfundingDate  the value for coins.crowdfunding_date
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setCrowdfundingDate(String crowdfundingDate) {
		this.crowdfundingDate = crowdfundingDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column coins.exchange
	 * @return  the value of coins.exchange
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public String getExchange() {
		return exchange;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column coins.exchange
	 * @param exchange  the value for coins.exchange
	 * @mbg.generated  Mon Sep 17 10:36:37 CST 2018
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
