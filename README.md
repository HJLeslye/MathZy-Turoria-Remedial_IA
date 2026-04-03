# MathZy: AI-Powered Remedial Mathematics Web Platform 🧮🤖

## Executive Summary

**MathZy** is an advanced educational web application engineered to provide remedial mathematics tutoring through the integration of **Artificial Intelligence Agents**. This project bridges the gap between modern web development and applied AI, delivering a highly interactive, personalized learning environment. 

Unlike traditional static learning management systems, MathZy utilizes intelligent agents to parse mathematical queries, evaluate user logic step-by-step, and generate dynamic, contextual feedback to facilitate cognitive reinforcement.

### System Demonstration

[![MathZy Demonstration](./assets/img/demo.gif)](#)
*Real-time interaction between the user interface and the AI tutoring agents.*

## Technical Stack & Infrastructure

* **Front-End Architecture:** [Insert Framework, e.g., React / Vue.js / HTML5 & Vanilla JS]
* **Back-End / API Layer:** [Insert Backend, e.g., Node.js / Python Flask / FastAPI]
* **Artificial Intelligence Core:** [Insert AI Tech, e.g., OpenAI API / LangChain / Custom NLP Models] for agent-based reasoning.
* **State Management:** Handles asynchronous API calls and dynamic UI updates during AI inference times.

---

## System Architecture & Agent Logic

The platform operates on a multi-tier architecture, ensuring seamless communication between the client interface and the AI reasoning engine:

1. **User Input & Parsing (Client-Side):** The web interface captures the user's mathematical problem or conceptual question.
2. **Agentic Reasoning Pipeline (Server/API-Side):** The input is routed to the AI core, where specific "Agents" act upon the prompt:
   * *Tutor Agent:* Breaks down the mathematical logic into digestible steps.
   * *Evaluation Agent:* Assesses user answers to identify specific misconceptions rather than just grading binary outcomes.
3. **Dynamic Response Rendering:** The processed remedial feedback is sent back to the client and rendered dynamically, utilizing mathematical formatting libraries (e.g., [Insert library if used, e.g., MathJax/KaTeX]).

---

## Educational Implementation Matrix

To ensure the AI serves a pedagogical purpose rather than just providing direct answers, the following interaction constraints were programmed:

| Agent Role | System Action | Pedagogical Goal |
| :--- | :--- | :--- |
| **Concept Explanation** | Retrieves relevant mathematical theories based on the query | Establish foundational knowledge |
| **Step-by-Step Guidance** | Generates sequential hints without revealing the final solution | Encourage critical thinking and problem-solving |
| **Error Correction** | Analyzes incorrect user inputs to isolate the exact point of failure | Targeted remedial intervention |

---

## How to Run & Deploy

1. Clone the repository to your local machine:
   ```bash
   git clone [https://github.com/HJLeslye/MathZy-Turoria-Remedial_IA.git](https://github.com/HJLeslye/MathZy-Turoria-Remedial_IA.git)
   ```
2. **Environment Variables:** Create a `.env` file in the root directory and add your necessary API keys (e.g., AI provider keys).
   ```text
   [INSERT_VARIABLE_NAME]=your_api_key_here
   ```
3. **Dependencies:** Install the required packages for both the client and the server:
   ```bash
   [Insert install command, e.g., npm install / pip install -r requirements.txt]
   ```
4. **Execution:** Start the development server:
   ```bash
   [Insert run command, e.g., npm run dev / python app.py]
   ```

---

## Contact Details

> **Leslye Hernández Jiménez**
> *Engineering in Information and Communication Technologies*
>
> **LinkedIn**: [View Profile](https://www.linkedin.com/in/leslye-hern%C3%A1ndez-jim%C3%A9nez-5559403a6)
> **Email**: [hdezj.leslye@gmail.com](mailto:hdezj.leslye@gmail.com)

---
*Developed as a comprehensive engineering prototype combining web architecture with intelligent systems.*
