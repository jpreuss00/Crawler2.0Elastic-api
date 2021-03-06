/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.crawler.server.api;

import com.example.crawler.server.model.Article;
import com.example.crawler.server.model.InlineResponse400;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-17T15:27:21.465175+02:00[Europe/Berlin]")

@Validated
@Api(value = "crawler", description = "the crawler API")
public interface CrawlerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "addArticle", notes = "Save an Article", response = Article.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucessfully saved an Article", response = Article.class),
        @ApiResponse(code = 400, message = "Bad Request", response = InlineResponse400.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = InlineResponse400.class) })
    @RequestMapping(value = "/crawler/addArticle",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Article> addArticle(@ApiParam(value = ""  )  @Valid @RequestBody Article article) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"link\" : \"link\",  \"guid\" : 0,  \"description\" : \"description\",  \"title\" : \"title\",  \"category\" : \"category\",  \"pubDate\" : \"pubDate\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getArticles", notes = "Returns an Array of Articles", response = Article.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucessfully returned an Array of Articles", response = Article.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = InlineResponse400.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = InlineResponse400.class) })
    @RequestMapping(value = "/crawler/getArticles",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Article>> getArticles() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"link\" : \"link\",  \"guid\" : 0,  \"description\" : \"description\",  \"title\" : \"title\",  \"category\" : \"category\",  \"pubDate\" : \"pubDate\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getArticlesByCategory", notes = "Returns an Array of Articles filtered by Category", response = Article.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucessfully returned an filtered Array of Articles", response = Article.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = InlineResponse400.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = InlineResponse400.class) })
    @RequestMapping(value = "/crawler/getArticlesByCategory",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Article>> getArticlesByCategory(@ApiParam(value = "") @Valid @RequestParam(value = "category", required = false) String category) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"link\" : \"link\",  \"guid\" : 0,  \"description\" : \"description\",  \"title\" : \"title\",  \"category\" : \"category\",  \"pubDate\" : \"pubDate\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getArticlesByTerm", notes = "Returns an Array of Articles filtered by Term", response = Article.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucessfully returned an filtered Array of Articles", response = Article.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = InlineResponse400.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = InlineResponse400.class) })
    @RequestMapping(value = "/crawler/getArticlesByTerm",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Article>> getArticlesByTerm(@ApiParam(value = "") @Valid @RequestParam(value = "term", required = false) String term) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"link\" : \"link\",  \"guid\" : 0,  \"description\" : \"description\",  \"title\" : \"title\",  \"category\" : \"category\",  \"pubDate\" : \"pubDate\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
