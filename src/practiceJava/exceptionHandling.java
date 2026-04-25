package practiceJava;

import java.util.NoSuchElementException;

public class exceptionHandling {
    /*
Throwable
│
├── Error (System-level issues, NOT recoverable)
│   → Caused by JVM or system failure
│   → Should NOT be handled using try-catch
│
│   ├── OutOfMemoryError
│   │   → JVM runs out of heap memory
│   │
│   └── StackOverflowError
│       → Infinite or very deep recursion
│
└── Exception (Application-level, recoverable)
    → Can be handled using try-catch
    │
    ├── Checked Exception (Compile-time)
    │   → Must be handled using try-catch OR declared using throws
    │
    │   ├── IOException
    │   │   → File/network operation failure
    │   │
    │   ├── SQLException
    │   │   → Database-related errors
    │   │
    │   └── FileNotFoundException
    │       → File not found at given path
    │
    └── Unchecked Exception (RuntimeException)
        → Occurs at runtime, caused by coding mistakes
        │
        ├── NullPointerException
        │   → Accessing object with null reference
        │
        ├── ArrayIndexOutOfBoundsException
        │   → Accessing invalid array index
        │
        └── NoSuchElementException
            → Element not found (Java collections / iterators)

            ─────────────────────────────────────────────
            Selenium Exceptions (Runtime Exceptions)
            ─────────────────────────────────────────────

            ├── org.openqa.selenium.NoSuchElementException
            │   → Element not found in DOM
            │
            ├── org.openqa.selenium.StaleElementReferenceException
            │   → Element is no longer attached to DOM (page refreshed/updated)
            │
            ├── org.openqa.selenium.TimeoutException
            │   → Wait condition not met within given time
            │
            ├── org.openqa.selenium.ElementNotInteractableException
            │   → Element present but not clickable/visible
            │
            ├── org.openqa.selenium.ElementClickInterceptedException
            │   → Another element is blocking the click
            │
            ├── org.openqa.selenium.InvalidSelectorException
            │   → Wrong XPath/CSS selector
            │
            └── org.openqa.selenium.WebDriverException
                → Base class for most Selenium exceptions
*/
    public static  void main(String[] args) {
        int driver = 100;
        int webElement= 0;
        try{
            int result= driver/webElement;
        }catch(Exception e){
            System.out.println("Element not found "+ e.getMessage());
        }
    }
}
