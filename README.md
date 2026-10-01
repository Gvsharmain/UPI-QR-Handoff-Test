# UPI QR / Intent Handoff Test

This test uses the exact UPI payload:

`upi://pay?pa=vyom101292@icici&pn=VISHNU%20SHARMA&cu=INR`

It provides:
1. PhonePe-targeted ACTION_VIEW intent.
2. Generic UPI ACTION_VIEW intent.

IMPORTANT:
- This does NOT spoof or inject a result into PhonePe's QR scanner.
- Android/PhonePe may treat an external intent differently from a scanned QR.
- Verify the recipient and amount before approving any transaction.
- Do not enter or expose a UPI PIN outside the official UPI app.

Build with Android Studio/Gradle.
