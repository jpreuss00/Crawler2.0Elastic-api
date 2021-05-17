# DefaultApi

All URIs are relative to *https://localhost.com:9200*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addArticlesPost**](DefaultApi.md#addArticlesPost) | **POST** /addArticles | 
[**getArticlesByCategoryGet**](DefaultApi.md#getArticlesByCategoryGet) | **GET** /getArticlesByCategory | 
[**getArticlesByTermGet**](DefaultApi.md#getArticlesByTermGet) | **GET** /getArticlesByTerm | 
[**getArticlesGet**](DefaultApi.md#getArticlesGet) | **GET** /getArticles | 



## addArticlesPost

> List&lt;Article&gt; addArticlesPost(article)



Save an Article

### Example

```java
// Import classes:
import api.client.invoker.ApiClient;
import api.client.invoker.ApiException;
import api.client.invoker.Configuration;
import api.client.invoker.models.*;
import api.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost.com:9200");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Article article = new Article(); // Article | 
        try {
            List<Article> result = apiInstance.addArticlesPost(article);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addArticlesPost");
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

[**List&lt;Article&gt;**](Article.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucessfully saved an Article |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |


## getArticlesByCategoryGet

> List&lt;Article&gt; getArticlesByCategoryGet()



Returns an Array of Articles filtered by Category

### Example

```java
// Import classes:
import api.client.invoker.ApiClient;
import api.client.invoker.ApiException;
import api.client.invoker.Configuration;
import api.client.invoker.models.*;
import api.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost.com:9200");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<Article> result = apiInstance.getArticlesByCategoryGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getArticlesByCategoryGet");
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
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucessfully returned an filtered Array of Articles |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |


## getArticlesByTermGet

> List&lt;Article&gt; getArticlesByTermGet()



Returns an Array of Articles filtered by Term

### Example

```java
// Import classes:
import api.client.invoker.ApiClient;
import api.client.invoker.ApiException;
import api.client.invoker.Configuration;
import api.client.invoker.models.*;
import api.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost.com:9200");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<Article> result = apiInstance.getArticlesByTermGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getArticlesByTermGet");
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
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucessfully returned an filtered Array of Articles |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |


## getArticlesGet

> List&lt;Article&gt; getArticlesGet()



Returns an Array of Articles

### Example

```java
// Import classes:
import api.client.invoker.ApiClient;
import api.client.invoker.ApiException;
import api.client.invoker.Configuration;
import api.client.invoker.models.*;
import api.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost.com:9200");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<Article> result = apiInstance.getArticlesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getArticlesGet");
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
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucessfully returned an Array of Articles |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

