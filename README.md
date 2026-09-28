# AI Video Personal — mobile-only

This version is designed for personal use without a per-video cloud AI API.

What it does:
- Android app
- User enters a script
- Android built-in Text-to-Speech creates the voice
- User selects images from the phone
- App is designed for local video assembly
- No API key is required
- No monthly video quota is imposed by this app

Important:
This is NOT unlimited cloud text-to-video generation. True generative video models require substantial GPU resources. This personal version avoids those API costs by using local phone capabilities.

Next production step:
Add an Android media/video rendering layer (Media3/FFmpeg) to combine selected images, generated TTS audio, transitions, and optional background music into MP4.
