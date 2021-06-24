# DefaultApi

All URIs are relative to *https://localhost.com:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addArticle**](DefaultApi.md#addArticle) | **POST** /crawler/addArticle | 
[**getArticles**](DefaultApi.md#getArticles) | **GET** /crawler/getArticles | 
[**getArticlesByCategory**](DefaultApi.md#getArticlesByCategory) | **GET** /crawler/getArticlesByCategory | 
[**getArticlesByTerm**](DefaultApi.md#getArticlesByTerm) | **GET** /crawler/getArticlesByTerm | 



## addArticle

> Article addArticle(article)



Save an Article

### Example

```java
// Import classes:
import com.example.crawler.client.invoker.ApiClient;
import com.example.crawler.client.invoker.ApiException;
import com.example.crawler.client.invoker.Configuration;
import com.example.crawler.client.invoker.models.*;
import com.example.crawler.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost.com:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Article article = new Article(); // Article | 
        try {
            Article result = apiInstance.addArticle(article);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addArticle");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **article** | [**Article**](Article.md)|  | [optional]

### Return type

[**Article**](Article.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucessfully saved an Article |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |


## getArticles

> List&lt;Article&gt; getArticles()



Returns an Array of Articles

### Example

```java
// Import classes:
import com.example.crawler.client.invoker.ApiClient;
import com.example.crawler.client.invoker.ApiException;
import com.example.crawler.client.invoker.Configuration;
import com.example.crawler.client.invoker.models.*;
import com.example.crawler.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost.com:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<Article> result = apiInstance.getArticles();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getArticles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Article&gt;**](Article.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucessfully returned an Array of Articles |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |


## getArticlesByCategory

> List&lt;Article&gt; getArticlesByCategory(category)



Returns an Array of Articles filtered by Category

### Example

```java
// Import classes:
import com.example.crawler.client.invoker.ApiClient;
import com.example.crawler.client.invoker.ApiException;
import com.example.crawler.client.invoker.Configuration;
import com.example.crawler.client.invoker.models.*;
import com.example.crawler.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost.com:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String category = "category_example"; // String | 
        try {
            List<Article> result = apiInstance.getArticlesByCategory(category);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getArticlesByCategory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**|  | [optional]

### Return type

[**List&lt;Article&gt;**](Article.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucessfully returned an filtered Array of Articles |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |


## getArticlesByTerm

> List&lt;Article&gt; getArticlesByTerm(term)



Returns an Array of Articles filtered by Term

### Example

```java
// Import classes:
import com.example.crawler.client.invoker.ApiClient;
import com.example.crawler.client.invoker.ApiException;
import com.example.crawler.client.invoker.Configuration;
import com.example.crawler.client.invoker.models.*;
import com.example.crawler.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost.com:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String term = "term_example"; // String | 
        try {
            List<Article> result = apiInstance.getArticlesByTerm(term);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getArticlesByTerm");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  | [optional]

### Return type

[**List&lt;Article&gt;**](Article.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucessfully returned an filtered Array of Articles |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

