# jenu-gumpu-app
PROJECT MASTER DOCUMENT: 
JENU-GUMPU 
Course: Android App Development using GenAI 
Domain: Agriculture / Self-Employment / Tribal Empowerment 
Tech Stack: Kotlin, Firebase, MVVM, Room DB, Jetpack Compose 
1. Project Identity & Problem Statement 
● The Vision: Jenu-Gumpu (Honey Producer’s Collective) empowers rural honey 
hunters to become brands rather than selling raw products to middlemen. 
● The Problem: Tribal hunters lack knowledge of "Value Add" (filtering, grading, 
branding) and retail pricing in urban centers. 
● Impact Goals: Promoting "Forest-to-Table" products and sustainable harvesting 
guidelines to protect bee colonies. 
2. Functional Requirements & App Flow 
The app is designed to be a high-performance, real-time ecosystem: 
● Harvest Log: Records date, location, quantity, and "Floral Source" (e.g., Coffee 
blossom, Wildflower). 
● AI Grading Tool: A visual guide and image analysis system to check honey quality 
(Grade A, B, or C). 
● Price Monitor: Real-time retail vs. wholesale price tracking. 
● Batch Tracker: Assignment of unique "Batch IDs" for blockchain-based traceability. 
● Collective Stock: Aggregated view of all individual entries to negotiate better bulk 
prices. 
3. Comprehensive Screen Prompts (UI/UX) 
Screen 
Login/Auth 
Prompt for AI/Development 
Build a nature-themed login with Email, Mobile/OTP (with Resend), and 
Social logins. Include a global language selector (Default: Kannada). 
Dashboard 
Create a dashboard showing "Total Collective Stock" (KG) and a Price 
Monitor graph. Include a Bottom Navigation Bar. 
AI Quality Log Form to log harvest with a "Scan Honey" button. Use CardViews with 
icons to display predicted Grade A, B, or C. 
Financials 
Marketplace 
Library & AI 
A "Profit Calculator" that takes input for quantity and filtering costs, 
outputting net earnings. 
A buyer-seller chat system with integrated payment buttons and order 
tracking for delivery. 
A knowledge hub with voice assistant activation and sustainability 
guidelines for bee-safe harvesting. 
4. Technical Implementation SOP 
A. Backend & Database 
● MVVM Architecture: Separation of UI (Compose), Logic (ViewModel), and Data 
(Repository). 
● Firebase: Handle User Auth, Cloud Storage for AI images, and Firestore for 
real-time stock updates. 
● Room DB: Ensure the app works offline by caching harvest logs locally before 
syncing to the cloud. 
● Retrofit: Fetch live retail market data via external APIs. 
B. Localization & Accessibility 
● Language: The UI must be available in Kannada. 
● Visuals: Use Icons instead of complex text for grading to accommodate different 
literacy levels. 
5. Standard Operating Procedure (SOP) for Kotlin 
Development 
1. Environment: Set up Android Studio with Jetpack Compose and Firebase BoM. 
2. Room Setup: Define an @Entity for HarvestLog with fields for FloralSource and 
BatchID. 
3. UI Construction: Build the Scaffold layout with a floating action button for new 
entries. 
4. Logic: Implement a sum() function in the Repository to calculate the "Collective 
Stock" from all users. 
5. Integration: Connect a voice-to-text API for hands-free logging and a camera intent 
for AI quality detection. 
1. Project Vision & The Problem Statement 
● The Problem: Rural honey hunters currently sell raw honey to middlemen at very 
low prices. They lack the knowledge of "Value Add" (filtering, grading, branding) and 
are unaware of high retail market prices in big cities. 
● The Solution: Jenu-Gumpu is a "Honey Producer's Collective" app. It empowers 
hunters to become their own brand by tracking quality, collaborating as a group, and 
negotiating better prices. 
2. Core Feature Workflow 
Based on the project roadmap, the app is built around these four pillars: 
1. Harvest Log: Records the date, location, and quantity of honey collected. 
2. Grading Tool: A visual guide and simulated moisture/color test to check quality. 
3. Price Monitor: A real-time tracker showing retail vs. wholesale prices. 
4. Batch Tracker: Assigns a unique "Batch ID" to honey jars for forest-to-table 
traceability. 
3. Advanced Technical Integration 
To make this a "real-time working" production app, the following stack is used: 
● Frontend: Jetpack Compose for advanced, responsive UI. 
● Backend: Firebase for User Auth (Email/Google/Social), Firestore for real-time 
collective stock, and Cloud Storage. 
● Database: Room DB to store harvest history, grades, and floral sources locally. 
● AI Components: AI-powered honey grading via image analysis and a Voice 
Assistant for hands-free logging in the field. 
● Logic: A Profit Calculator that displays earnings after filtering and processing costs, 
comparing them against raw honey prices. 
4. Global Feature Modules 
● Multilingual Support: The UI must be available in Kannada and other world 
languages. 
● Account & Profile: Includes account status, user type, gender, and notification 
preferences. 
● Marketplace: Includes online payment options, delivery tracking, and a buyer-seller 
chat system. 
● Security: Blockchain-based batch tracking for immutable data records. 
5. Impact & Sustainability Goals 
● Tribal Empowerment: Improving livelihoods for forest-dwelling communities. 
● Organic Growth: Promoting "Forest-to-Table" chemical-free products. 
● Sustainable Harvest: Providing guidelines on harvesting honey without killing the 
bee colony. 
6. Success Criteria 
● Users must be able to categorize honey by Floral Source (e.g., Coffee blossom, 
Wildflower). 
● Collective Stock must be viewable as the sum of all individual user entries.
