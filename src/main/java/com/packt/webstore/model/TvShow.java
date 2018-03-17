package com.packt.webstore.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@XmlRootElement
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "idShow", "c00", "c01", "c02", "c03", "c04", "c05", "c06", "c07", "c08", "c09", "c10", "c11",
		"c12", "c13", "c14", "c15", "c16", "c17", "c18", "c19", "c20", "c21", "c22", "c23" })
public class TvShow implements Serializable {

	@JsonProperty("idShow")
	private Integer idShow;
	@JsonProperty("c00")
	private String c00;
	@JsonProperty("c01")
	private String c01;
	@JsonProperty("c02")
	private String c02;
	@JsonProperty("c03")
	private String c03;
	@JsonProperty("c04")
	private String c04;
	@JsonProperty("c05")
	private String c05;
	@JsonProperty("c06")
	private String c06;
	@JsonProperty("c07")
	private String c07;
	@JsonProperty("c08")
	private String c08;
	@JsonProperty("c09")
	private String c09;
	@JsonProperty("c10")
	private String c10;
	@JsonProperty("c11")
	private String c11;
	@JsonProperty("c12")
	private String c12;
	@JsonProperty("c13")
	private String c13;
	@JsonProperty("c14")
	private String c14;
	@JsonProperty("c15")
	private String c15;
	@JsonProperty("c16")
	private Object c16;
	@JsonProperty("c17")
	private Object c17;
	@JsonProperty("c18")
	private Object c18;
	@JsonProperty("c19")
	private Object c19;
	@JsonProperty("c20")
	private Object c20;
	@JsonProperty("c21")
	private Object c21;
	@JsonProperty("c22")
	private Object c22;
	@JsonProperty("c23")
	private Object c23;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public TvShow() {

	}

	public TvShow(String titel) {
		c00 = titel;
	}

	@JsonProperty("idShow")
	public Integer getIdShow() {
		return idShow;
	}

	@JsonProperty("idShow")
	public void setIdShow(Integer idShow) {
		this.idShow = idShow;
	}

	@JsonProperty("c00")
	public String getC00() {
		return c00;
	}

	@JsonProperty("c00")
	public void setC00(String c00) {
		this.c00 = c00;
	}

	@JsonProperty("c01")
	public String getC01() {
		return c01;
	}

	@JsonProperty("c01")
	public void setC01(String c01) {
		this.c01 = c01;
	}

	@JsonProperty("c02")
	public String getC02() {
		return c02;
	}

	@JsonProperty("c02")
	public void setC02(String c02) {
		this.c02 = c02;
	}

	@JsonProperty("c03")
	public String getC03() {
		return c03;
	}

	@JsonProperty("c03")
	public void setC03(String c03) {
		this.c03 = c03;
	}

	@JsonProperty("c04")
	public String getC04() {
		return c04;
	}

	@JsonProperty("c04")
	public void setC04(String c04) {
		this.c04 = c04;
	}

	@JsonProperty("c05")
	public String getC05() {
		return c05;
	}

	@JsonProperty("c05")
	public void setC05(String c05) {
		this.c05 = c05;
	}

	@JsonProperty("c06")
	public String getC06() {
		return c06;
	}

	@JsonProperty("c06")
	public void setC06(String c06) {
		this.c06 = c06;
	}

	@JsonProperty("c07")
	public String getC07() {
		return c07;
	}

	@JsonProperty("c07")
	public void setC07(String c07) {
		this.c07 = c07;
	}

	@JsonProperty("c08")
	public String getC08() {
		return c08;
	}

	@JsonProperty("c08")
	public void setC08(String c08) {
		this.c08 = c08;
	}

	@JsonProperty("c09")
	public String getC09() {
		return c09;
	}

	@JsonProperty("c09")
	public void setC09(String c09) {
		this.c09 = c09;
	}

	@JsonProperty("c10")
	public String getC10() {
		return c10;
	}

	@JsonProperty("c10")
	public void setC10(String c10) {
		this.c10 = c10;
	}

	@JsonProperty("c11")
	public String getC11() {
		return c11;
	}

	@JsonProperty("c11")
	public void setC11(String c11) {
		this.c11 = c11;
	}

	@JsonProperty("c12")
	public String getC12() {
		return c12;
	}

	@JsonProperty("c12")
	public void setC12(String c12) {
		this.c12 = c12;
	}

	@JsonProperty("c13")
	public String getC13() {
		return c13;
	}

	@JsonProperty("c13")
	public void setC13(String c13) {
		this.c13 = c13;
	}

	@JsonProperty("c14")
	public String getC14() {
		return c14;
	}

	@JsonProperty("c14")
	public void setC14(String c14) {
		this.c14 = c14;
	}

	@JsonProperty("c15")
	public String getC15() {
		return c15;
	}

	@JsonProperty("c15")
	public void setC15(String c15) {
		this.c15 = c15;
	}

	@JsonProperty("c16")
	public Object getC16() {
		return c16;
	}

	@JsonProperty("c16")
	public void setC16(Object c16) {
		this.c16 = c16;
	}

	@JsonProperty("c17")
	public Object getC17() {
		return c17;
	}

	@JsonProperty("c17")
	public void setC17(Object c17) {
		this.c17 = c17;
	}

	@JsonProperty("c18")
	public Object getC18() {
		return c18;
	}

	@JsonProperty("c18")
	public void setC18(Object c18) {
		this.c18 = c18;
	}

	@JsonProperty("c19")
	public Object getC19() {
		return c19;
	}

	@JsonProperty("c19")
	public void setC19(Object c19) {
		this.c19 = c19;
	}

	@JsonProperty("c20")
	public Object getC20() {
		return c20;
	}

	@JsonProperty("c20")
	public void setC20(Object c20) {
		this.c20 = c20;
	}

	@JsonProperty("c21")
	public Object getC21() {
		return c21;
	}

	@JsonProperty("c21")
	public void setC21(Object c21) {
		this.c21 = c21;
	}

	@JsonProperty("c22")
	public Object getC22() {
		return c22;
	}

	@JsonProperty("c22")
	public void setC22(Object c22) {
		this.c22 = c22;
	}

	@JsonProperty("c23")
	public Object getC23() {
		return c23;
	}

	@JsonProperty("c23")
	public void setC23(Object c23) {
		this.c23 = c23;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}