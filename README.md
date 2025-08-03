
# 🔗 URL Safety Checker (Java)

## 📌 Description

This is a basic **URL Safety Checker** built in **Java** for beginners. It checks the entered URL for:
- Use of HTTPS (secure or not)
- Presence of IP address instead of a domain name
- Too many subdomains (a common trick in phishing)
- Matching against a local blacklist of known malicious domains

## 🧰 Tech Stack
- Language: Java
- No external libraries required
- Runs in command-line interface (CLI)

---

## 🚀 How to Run

### 1. Requirements
- Java JDK installed (Java 8+)
```bash
java -version
```

### 2. Save the Code
Save the file as `URLSafetyChecker.java`

### 3. Compile
Open terminal in the directory containing the file:
```bash
javac URLSafetyChecker.java
```

### 4. Run
```bash
java URLSafetyChecker
```

---

## 🧪 Sample Test

### ✅ Safe URL:
```
Enter URL: https://example.com
✔ Uses HTTPS (Good)
✅ Basic URL safety check completed.
```

### ❌ Suspicious URL:
```
Enter URL: http://login.paypal.verify.badwebsite.com
⚠ Uses HTTP (Not Secure)
⚠ Too many subdomains (Possibly suspicious)
❌ Domain is in known blacklist!
✅ Basic URL safety check completed.
```

---

## 📁 File Structure
```
URLSafetyChecker/
├── URLSafetyChecker.java
└── README.md
```

---

## 📚 Topics Learned
- URL parsing in Java
- Basic phishing detection logic
- String and regex manipulation
- CLI-based user interaction

---

## 🙏 Disclaimer
This tool is for **educational/demo purposes only**. For actual URL threat detection, use services like:
- Google Safe Browsing API
- VirusTotal
# project_18-20
