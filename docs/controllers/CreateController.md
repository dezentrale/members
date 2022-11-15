# CreateController

All URIs are relative to `""`

The controller class is defined in **[CreateController.java](../../src/main/java/space/dezentrale/members/controller/CreateController.java)**

| Method                                                                                           | HTTP request      | Description |
|--------------------------------------------------------------------------------------------------|-------------------|-------------|
| [**membersPost**](../../src/main/java/space/dezentrale/members/controller/CreateController.java) | **POST** /members |             |

<a name="membersPost"></a>
# **membersPost**
```java
Mono<Member> CreateController.membersPost(member)
```



An endpoint to create a new member after it has been approved by the association&#39;s board.

### Parameters
| Name       | Type                                      | Description | Notes |
|------------|-------------------------------------------|-------------|-------|
| **member** | [**Member**](../../docs/models/Member.md) |             |       |

### Return type
[**Member**](../../docs/models/Member.md)


### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

