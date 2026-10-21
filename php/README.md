# Placeholder Text Generator API - PHP Package

Placeholder Text Generator creates custom placeholder text and dummy copy across themes like lorem ipsum, tech, and corporate. Set the paragraph count, sentences per paragraph, and style to receive an array of generated text blocks.

## Installation

Install via Composer:

```bash
composer require apiverve/placeholdertext
```

## Getting Started

Get your API key at [APIVerve](https://apiverve.com)

### Basic Usage

```php
<?php

require_once 'vendor/autoload.php';

use APIVerve\Placeholdertext\Client;

// Initialize the client
$client = new Client('YOUR_API_KEY');

// Make a request
$response = $client->execute([
    'style' => 'lorem',
    'paragraphs' => 3,
    'sentences' => 5
]);

// Print the response
print_r($response);
```


### Error Handling

```php
use APIVerve\Placeholdertext\Client;
use APIVerve\Placeholdertext\Exceptions\APIException;
use APIVerve\Placeholdertext\Exceptions\ValidationException;

try {
    $response = $client->execute(['style' => 'lorem', 'paragraphs' => 3, 'sentences' => 5]);
    print_r($response['data']);
} catch (ValidationException $e) {
    echo "Validation error: " . implode(', ', $e->getErrors());
} catch (APIException $e) {
    echo "API error: " . $e->getMessage();
    echo "Status code: " . $e->getStatusCode();
}
```

### Debug Mode

```php
// Enable debug logging
$client = new Client(
    apiKey: 'YOUR_API_KEY',
    debug: true
);
```

## Example Response

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

## Requirements

- PHP 7.4 or higher
- Guzzle HTTP client

## Documentation

For more information, visit the [API Documentation](https://docs.apiverve.com/ref/placeholdertext?utm_source=packagist&utm_medium=referral&utm_content=readme).

## Support

- Website: [https://apiverve.com/marketplace/placeholdertext?utm_source=php&utm_medium=referral&utm_content=readme](https://apiverve.com/marketplace/placeholdertext?utm_source=php&utm_medium=referral&utm_content=readme)
- Email: hello@apiverve.com

## License

This package is available under the [MIT License](LICENSE).
