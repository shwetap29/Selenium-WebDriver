# 🌐 Selenium WebDriver — Browser Automation Learning Projects

> A collection of Selenium WebDriver projects practising cross-browser test automation, UI interaction handling, frame management, and dynamic web element control using Java.

---

## 📌 About This Collection

These repositories were built during my **Bridgelabz Software Engineering Apprenticeship (2021)** as a structured progression through Selenium WebDriver concepts. Each project targets a specific automation challenge — from basic browser control to handling complex UI elements like listboxes, frames, and dynamic content.

**Repos in this collection:**
- `Selenium-WebDriver` — Cross-browser test automation fundamentals
- `Selenium-Listbox` — Dropdown and listbox interaction handling
- `Handling-Frames` — iframe and frame switching in Selenium
- `Pages` — Page Object Model (POM) design pattern practice

---

## 🎯 What Each Project Covers

### 🖥️ Selenium-WebDriver — Cross Browser Tests
The foundation project. Covers launching browsers, navigating URLs, locating elements, and performing basic interactions.

- Launching Chrome, Firefox, and Edge using WebDriverManager
- Navigating to URLs, handling page loads and wait strategies
- Locating elements using: ID, Name, XPath, CSS Selector, Class Name
- Performing actions: click, type, clear, submit
- Taking screenshots on test failure
- Explicit and implicit waits for dynamic content

---

### 📋 Selenium-Listbox — Dropdown & List Handling
Focused specifically on handling `<select>` dropdowns and multi-select listboxes — one of the trickier UI elements to automate.

- Selecting options by visible text, value, and index
- Multi-select listbox — selecting and deselecting multiple options
- Getting all available options from a dropdown
- Verifying selected option after interaction
- Handling dynamic dropdowns that load options via AJAX

---

### 🖼️ Handling-Frames — iframe & Frame Switching
Frames are a common challenge in web automation — content inside an iframe is in a separate DOM context and requires explicit switching.

- Switching to a frame by index, name, and WebElement reference
- Interacting with elements inside an iframe
- Switching back to the main document (`defaultContent`)
- Handling nested frames (frame within a frame)
- Identifying when a page element is inside a frame vs. main DOM

---

### 📄 Pages — Page Object Model (POM)
Introduces the Page Object Model design pattern — the industry standard for maintainable Selenium test code.

- Separating page structure (locators) from test logic
- Creating a Page class for each screen with reusable action methods
- Reducing code duplication across test files
- Making tests easier to update when UI changes
- Base page class with shared utilities (wait methods, screenshots)

---

## 🛠️ Tools & Tech Stack

| Tool | Purpose |
|---|---|
| `Java` | Core programming language |
| `Selenium WebDriver 4.x` | Browser automation framework |
| `TestNG` | Test execution and assertions |
| `Maven` | Dependency and build management |
| `WebDriverManager` | Automatic browser driver management |
| `Chrome / Firefox / Edge` | Cross-browser test targets |

---

## 📁 Repo Structure (each repo follows this pattern)

```
Selenium-[ProjectName]/
│
├── src/
│   ├── test/java/
│   │   └── [TestClassName].java     ← Test scenarios
│   └── main/java/
│       ├── pages/                   ← Page Object classes (POM repos)
│       └── utils/                   ← Helper methods, wait utilities
├── pom.xml                          ← Maven dependencies
├── testng.xml                       ← Test suite configuration
└── README.md
```

---

## 💡 Skills Demonstrated

`Selenium WebDriver` · `Java` · `Cross-Browser Testing` · `XPath & CSS Selectors` · `Page Object Model (POM)` · `iframe Handling` · `Dropdown Automation` · `TestNG` · `Explicit & Implicit Waits` · `WebDriverManager` · `Maven`

---

## 📝 What I Learned

Selenium forced me to think about UI behaviour the way a user does — but also the way a system does. Understanding how browsers render frames, how dropdowns are structured in the DOM, and why wait strategies matter gave me a deep appreciation for front-end complexity. As a BA, this directly helps me write better acceptance criteria for UI features and catch edge cases testers might miss.

---
