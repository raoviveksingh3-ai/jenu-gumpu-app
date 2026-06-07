# Jenu-Gumpu App 🍯

> Empowering Rural Honey Hunters through Technology & Collaboration

**PROJECT MASTER DOCUMENT**

| Attribute | Details |
|-----------|---------|
| Course | Android App Development using GenAI |
| Domain | Agriculture / Self-Employment / Tribal Empowerment |
| Tech Stack | Kotlin, Firebase, MVVM, Room DB, Jetpack Compose |
| Language | Kannada (Primary), Multi-language Support |
| Platform | Android (API 21+) |

---

## 📋 Table of Contents

1. [Vision & Problem Statement](#vision--problem-statement)
2. [Core Features](#core-features)
3. [Technical Architecture](#technical-architecture)
4. [Setup & Installation](#setup--installation)
5. [Project Structure](#project-structure)
6. [Contributing](#contributing)
7. [Impact & Sustainability](#impact--sustainability)
8. [Success Criteria](#success-criteria)

---

## 🎯 Vision & Problem Statement

### The Problem
Rural honey hunters currently:
- Sell raw honey to middlemen at significantly lower prices
- Lack knowledge of value-add processes (filtering, grading, branding)
- Are unaware of high retail market prices in urban centers
- Have no mechanism to collectively negotiate better prices

### The Solution
**Jenu-Gumpu** (Honey Producer's Collective) is a mobile application that:
- ✅ Empowers hunters to become their own brand
- ✅ Tracks honey quality with AI-powered grading
- ✅ Enables collective collaboration and bulk negotiations
- ✅ Provides real-time price monitoring
- ✅ Ensures forest-to-table traceability with blockchain

### Impact Goals
- **Tribal Empowerment**: Improving livelihoods for forest-dwelling communities
- **Sustainable Harvest**: Guidelines on harvesting without harming bee colonies
- **Market Access**: Direct connection between producers and urban consumers

---

## ⭐ Core Features

### 1. **Harvest Logging** 📝
- Record date, location, and quantity of honey collected
- Capture floral source (e.g., Coffee blossom, Wildflower)
- Automatic batch ID generation for traceability
- Offline-first with automatic cloud sync

### 2. **AI Quality Grading** 🔍
- Visual image analysis for honey quality assessment
- Grade classification: A (Premium), B (Good), C (Standard)
- Moisture and color detection
- Card-based UI with icons for accessibility

### 3. **Price Monitor** 💹
- Real-time retail vs. wholesale price tracking
- Historical price trends
- Market insights for better pricing decisions

### 4. **Batch Tracker** 🏷️
- Unique batch ID assignment for each harvest
- Blockchain-based immutable records
- Forest-to-table traceability

### 5. **Collective Stock Dashboard** 📊
- Aggregated view of all individual entries
- Total collective stock (in KG)
- Group analytics for bulk negotiations

### 6. **Profit Calculator** 💰
- Calculate net earnings after filtering costs
- Compare processed vs. raw honey prices
- Financial insights and projections

### 7. **Marketplace** 🛒
- Buyer-seller chat system
- Integrated payment processing
- Real-time order tracking and delivery

### 8. **Knowledge Hub** 📚
- Sustainability guidelines for bee-safe harvesting
- Voice assistant for hands-free access
- Educational content in Kannada

---

## 🏗️ Technical Architecture

### Architecture Pattern
**MVVM (Model-View-ViewModel)**
- **UI Layer**: Jetpack Compose for modern, responsive interfaces
- **Logic Layer**: ViewModels for state management
- **Data Layer**: Repository pattern with Room & Firebase

### Technology Stack

| Component | Technology |
|-----------|-----------|
| UI Framework | Jetpack Compose |
| Architecture | MVVM + Repository Pattern |
| Local Database | Room DB |
| Backend | Firebase (Auth, Firestore, Cloud Storage) |
| Authentication | Email, Mobile OTP, Social Logins (Google, GitHub) |
| Real-time Data | Firestore |
| Image Processing | ML Kit, Cloud Vision API |
| Networking | Retrofit |
| Language | Kotlin |

### Key Technical Decisions

1. **Offline-First Approach**: Room DB caches harvest logs locally before syncing to cloud
2. **Real-time Updates**: Firestore enables live collective stock calculations
3. **Image Analysis**: ML Kit for on-device honey grading; Cloud Vision for advanced analysis
4. **Accessibility**: Icons and visual indicators for multi-literacy users
5. **Localization**: Built-in Kannada support with string resources

---

## 🚀 Setup & Installation

### Prerequisites
- **Android Studio** (Latest version)
- **Kotlin** 1.8+
- **Gradle** 8.0+
- **Java Development Kit (JDK)** 11+
- **Firebase Account** (for backend services)

### Step 1: Clone the Repository
```bash
git clone https://github.com/raoviveksingh3-ai/jenu-gumpu-app.git
cd jenu-gumpu-app
```

### Step 2: Install Dependencies
- Open the project in Android Studio
- Let Gradle sync automatically
- If needed, manually sync: `Gradle → Sync Now`

### Step 3: Firebase Configuration

1. Create a Firebase project at [console.firebase.google.com](https://console.firebase.google.com)
2. Register your Android app in Firebase Console
3. Download `google-services.json`
4. Place it in the `app/` directory:
   ```
   app/google-services.json
   ```
5. Enable these Firebase services:
   - Authentication (Email/Password, Google, OTP)
   - Cloud Firestore
   - Cloud Storage
   - Cloud Functions (optional)

### Step 4: Configure Local Properties
Create `local.properties` in the project root:
```properties
sdk.dir=/path/to/android/sdk
firebase.config=app/google-services.json
```

### Step 5: Build and Run
```bash
# Build the project
./gradlew build

# Run on emulator or device
./gradlew installDebug

# Or press Run in Android Studio
```

### Step 6: Initial Setup (First Run)
1. Launch the app
2. Select preferred language (Kannada/English)
3. Sign up with email or social login
4. Grant camera and location permissions
5. Complete user profile setup

---

## 📂 Project Structure

```
jenu-gumpu-app/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/com/jenu_gumpu/
│   │   │   │   ├── ui/
│   │   │   │   │   ├── screens/        # Jetpack Compose screens
│   │   │   │   │   ├── components/     # Reusable UI components
│   │   │   │   │   └── theme/          # App theme and styling
│   │   │   │   ├── viewmodel/          # MVVM ViewModels
│   │   │   │   ├── model/              # Data classes & entities
│   │   │   │   ├── repository/         # Data access layer
│   │   │   │   ├── database/           # Room database setup
│   │   │   │   ├── network/            # Retrofit API calls
│   │   │   │   ├── util/               # Helper functions
│   │   │   │   └── MainActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── values/             # Strings, dimensions
│   │   │   │   ├── values-kn/          # Kannada strings
│   │   │   │   ├── drawable/           # Icons and images
│   │   │   │   └── mipmap/             # App icons
│   │   │   └── AndroidManifest.xml
│   │   └── test/                       # Unit tests
│   ├── build.gradle.kts
│   └── google-services.json            # Firebase config (add this)
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

## 🤝 Contributing

We welcome contributions! Please follow these guidelines:

### Code of Conduct
- Be respectful and inclusive
- Focus on constructive feedback
- Help others learn and grow

### How to Contribute

1. **Fork the Repository**
   ```bash
   git clone https://github.com/your-username/jenu-gumpu-app.git
   cd jenu-gumpu-app
   ```

2. **Create a Feature Branch**
   ```bash
   git checkout -b feature/your-feature-name
   # or for bug fixes:
   git checkout -b bugfix/issue-description
   ```

3. **Follow Code Standards**
   - Use Kotlin idioms and best practices
   - Follow MVVM architecture
   - Write meaningful variable/function names
   - Add comments for complex logic
   - Keep functions small and focused

4. **Testing**
   ```bash
   # Run unit tests
   ./gradlew test
   
   # Run instrumented tests
   ./gradlew connectedAndroidTest
   ```

5. **Commit with Clear Messages**
   ```bash
   git commit -m "feature: add honey quality grading UI"
   git commit -m "fix: resolve Firestore sync issue"
   git commit -m "docs: update installation instructions"
   ```

6. **Push and Create Pull Request**
   ```bash
   git push origin feature/your-feature-name
   ```
   - Open a Pull Request on GitHub
   - Reference any related issues
   - Provide a clear description of changes

### Pull Request Checklist
- [ ] Code follows Kotlin style guide
- [ ] Unit tests pass
- [ ] UI components tested on multiple devices
- [ ] Documentation updated (if needed)
- [ ] No sensitive data in commits
- [ ] Commit messages are descriptive

### Reporting Issues
- Check if the issue already exists
- Provide a clear title and description
- Include steps to reproduce
- Add screenshots/logs if applicable
- Mention your device and Android version

---

## 🌱 Impact & Sustainability

### Tribal Empowerment
- **Direct Market Access**: Reduces middleman dependency
- **Economic Growth**: 2-3x price improvement for raw honey
- **Skill Development**: Knowledge hub for value-addition techniques

### Sustainable Harvesting
- **Bee Colony Protection**: Guidelines to ensure honey production doesn't harm colonies
- **Organic Growth**: Promotes chemical-free, forest-to-table products
- **Environmental Stewardship**: Education on sustainable forest management

### Community Benefits
- **Collective Strength**: Group negotiations for better bulk prices
- **Market Transparency**: Real-time price data for informed decisions
- **Social Inclusion**: Accessible UI for varying literacy levels

---

## ✅ Success Criteria

- ✅ Users can categorize honey by floral source (Coffee blossom, Wildflower, etc.)
- ✅ Collective Stock viewable as aggregated sum of all user entries
- ✅ AI grading achieves 85%+ accuracy on honey quality classification
- ✅ App functions offline with automatic sync when connected
- ✅ Blockchain-based batch tracking ensures immutable records
- ✅ Multi-language support (Kannada primary, English secondary)
- ✅ Voice assistant enables hands-free logging in field conditions
- ✅ Profit calculator provides accurate earnings projections
- ✅ Real-time price monitoring with market insights
- ✅ Payment integration for direct buyer-seller transactions

---

## 📞 Support & Feedback

- **Issues**: Report bugs and feature requests via GitHub Issues
- **Discussions**: Share ideas and ask questions in GitHub Discussions
- **Contact**: Reach out to the development team

---

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

---

## 🙏 Acknowledgments

- Built with ❤️ for rural honey producers
- Thanks to the Android & Firebase communities
- Special appreciation to GenAI Course instructors and mentors

---

**Last Updated**: June 2026 | **Status**: Active Development 🚀
