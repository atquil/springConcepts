package com.atquil.springconcepts.beanAndComponent;

public class WebAwareBeanScope {
}

////Request: In this scope, a new instance of the bean is created for each HTTP request.
//@Component
//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
//public class MyRequestBean {
//    // ...
//}
//
////Session:In this scope, a new instance of the bean is created for each HTTP request.
//@Component
//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
//public class MySessionBean {
//    // ...
//}
//
////Application:In this scope, a new instance of the bean is created for each ServletContext.
//@Component
//@Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
//public class MyApplicationBean {
//    // ...
//}
//
////Websocket: In this scope, a new instance of the bean is created for each WebSocket.
//@Component
//@Scope(value = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
//public class MyWebSocketBean {
//    // ...
//}
