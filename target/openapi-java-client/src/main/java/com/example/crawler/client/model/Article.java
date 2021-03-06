/*
 * Crawler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.example.crawler.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Article
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-17T15:27:21.727757+02:00[Europe/Berlin]")
public class Article {
  public static final String JSON_PROPERTY_TITLE = "title";
  @JsonProperty(JSON_PROPERTY_TITLE)
  private String title;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  private String category;

  public static final String JSON_PROPERTY_GUID = "guid";
  @JsonProperty(JSON_PROPERTY_GUID)
  private Integer guid;

  public static final String JSON_PROPERTY_PUB_DATE = "pubDate";
  @JsonProperty(JSON_PROPERTY_PUB_DATE)
  private String pubDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  private String description;

  public static final String JSON_PROPERTY_LINK = "link";
  @JsonProperty(JSON_PROPERTY_LINK)
  private String link;

  public Article title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Article category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Article guid(Integer guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getGuid() {
    return guid;
  }

  public void setGuid(Integer guid) {
    this.guid = guid;
  }

  public Article pubDate(String pubDate) {
    this.pubDate = pubDate;
    return this;
  }

   /**
   * Get pubDate
   * @return pubDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getPubDate() {
    return pubDate;
  }

  public void setPubDate(String pubDate) {
    this.pubDate = pubDate;
  }

  public Article description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Article link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;
    return Objects.equals(this.title, article.title) &&
        Objects.equals(this.category, article.category) &&
        Objects.equals(this.guid, article.guid) &&
        Objects.equals(this.pubDate, article.pubDate) &&
        Objects.equals(this.description, article.description) &&
        Objects.equals(this.link, article.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, category, guid, pubDate, description, link);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Article {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    pubDate: ").append(toIndentedString(pubDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

