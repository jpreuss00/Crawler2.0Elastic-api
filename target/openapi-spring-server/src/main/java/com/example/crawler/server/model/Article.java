package com.example.crawler.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Article
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-17T15:27:21.465175+02:00[Europe/Berlin]")

public class Article   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("category")
  private String category;

  @JsonProperty("guid")
  private Integer guid;

  @JsonProperty("pubDate")
  private String pubDate;

  @JsonProperty("description")
  private String description;

  @JsonProperty("link")
  private String link;

  public Article title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
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
  */
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
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


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
  */
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
  */
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
  */
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

