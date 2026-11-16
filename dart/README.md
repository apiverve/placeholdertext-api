# Placeholder Text Generator API - Dart/Flutter Client

Placeholder Text Generator creates custom placeholder text and dummy copy across themes like lorem ipsum, tech, and corporate. Set the paragraph count, sentences per paragraph, and style to receive an array of generated text blocks.

[![pub package](https://img.shields.io/pub/v/apiverve_placeholdertext.svg)](https://pub.dev/packages/apiverve_placeholdertext)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This is the Dart/Flutter client for the [Placeholder Text Generator API](https://apiverve.com/marketplace/placeholdertext?utm_source=dart&utm_medium=referral&utm_content=readme).

## Installation

Add this to your `pubspec.yaml`:

```yaml
dependencies:
  apiverve_placeholdertext: ^1.2.6
```

Then run:

```bash
dart pub get
# or for Flutter
flutter pub get
```

## Usage

```dart
import 'package:apiverve_placeholdertext/apiverve_placeholdertext.dart';

void main() async {
  final client = PlaceholdertextClient('YOUR_API_KEY');

  try {
    final response = await client.execute({
      'style': 'lorem',
      'paragraphs': 3,
      'sentences': 5
    });

    print('Status: ${response.status}');
    print('Data: ${response.data}');
  } catch (e) {
    print('Error: $e');
  }
}
```

## Response

```json
{
  "status": "ok",
  "error": null,
  "data": {
    "style": "tech",
    "paragraphs": [
      "Docker latency interface debugging API git protocol module REST latency. DevOps API optimization javascript variable cache query blockchain. Scalability typescript API throughput typescript package refactor microservice blockchain docker compiler typescript. Algorithm query throughput scalability scalability microservice. DevOps algorithm XML throughput framework optimization API deployment docker deployment query sprint refactor stack.",
      "Neural deployment hardware bandwidth protocol stack variable algorithm iteration throughput algorithm kubernetes repository. Frontend server stack javascript CI/CD container module latency load balancer compiler cache DevOps. Server DevOps kubernetes bandwidth REST agile neural module repository. Database protocol stack bandwidth scalability optimization load balancer backend. Debugging DevOps webhook REST stack protocol hardware blockchain docker server agile microservice.",
      "Backend javascript throughput docker javascript stack debugging algorithm microservice cloud REST compiler DevOps runtime middleware. Deployment load balancer javascript query SDK bandwidth refactor typescript runtime throughput stack virtualization algorithm server. Backend cloud sprint latency repository microservice API hardware virtualization cache git. Middleware sprint module compiler query encryption debugging backend docker throughput microservice. Compiler variable latency iteration compiler frontend package agile microservice latency throughput API compiler XML DevOps."
    ],
    "paragraph_count": 3,
    "sentences_per_paragraph": 5,
    "total_sentences": 15,
    "total_words": 173,
    "total_characters": 1503,
    "full_text": "Docker latency interface debugging API git protocol module REST latency. DevOps API optimization javascript variable cache query blockchain. Scalability typescript API throughput typescript package refactor microservice blockchain docker compiler typescript. Algorithm query throughput scalability scalability microservice. DevOps algorithm XML throughput framework optimization API deployment docker deployment query sprint refactor stack.\n\nNeural deployment hardware bandwidth protocol stack variable algorithm iteration throughput algorithm kubernetes repository. Frontend server stack javascript CI/CD container module latency load balancer compiler cache DevOps. Server DevOps kubernetes bandwidth REST agile neural module repository. Database protocol stack bandwidth scalability optimization load balancer backend. Debugging DevOps webhook REST stack protocol hardware blockchain docker server agile microservice.\n\nBackend javascript throughput docker javascript stack debugging algorithm microservice cloud REST compiler DevOps runtime middleware. Deployment load balancer javascript query SDK bandwidth refactor typescript runtime throughput stack virtualization algorithm server. Backend cloud sprint latency repository microservice API hardware virtualization cache git. Middleware sprint module compiler query encryption debugging backend docker throughput microservice. Compiler variable latency iteration compiler frontend package agile microservice latency throughput API compiler XML DevOps."
  }
}
```

## API Reference

- **API Home:** [Placeholder Text Generator API](https://apiverve.com/marketplace/placeholdertext?utm_source=dart&utm_medium=referral&utm_content=readme)
- **Documentation:** [docs.apiverve.com/ref/placeholdertext](https://docs.apiverve.com/ref/placeholdertext?utm_source=dart&utm_medium=referral&utm_content=readme)

## Authentication

All requests require an API key. Get yours at [apiverve.com](https://apiverve.com?utm_source=dart&utm_medium=referral&utm_content=readme).

## License

MIT License - see [LICENSE](LICENSE) for details.

---

Built with Dart for [APIVerve](https://apiverve.com?utm_source=dart&utm_medium=referral&utm_content=readme)
