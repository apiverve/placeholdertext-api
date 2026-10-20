Placeholder Text Generator API
============

Placeholder Text Generator creates custom placeholder text and dummy copy across themes like lorem ipsum, tech, and corporate. Set the paragraph count, sentences per paragraph, and style to receive an array of generated text blocks.


[![PyPI version](https://img.shields.io/pypi/v/apiverve-placeholdertextgenerator.svg)](https://pypi.org/project/apiverve-placeholdertextgenerator/)

This is a Python wrapper for the [Placeholder Text Generator API](https://apiverve.com/marketplace/placeholdertext?utm_source=pypi&utm_medium=referral&utm_content=readme)

---

## Installation

Using `pip`:

```bash
pip install apiverve-placeholdertextgenerator
```

Using `pip3`:

```bash
pip3 install apiverve-placeholdertextgenerator
```

---

## Configuration

Before using the Placeholder Text Generator API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=pypi&utm_medium=referral&utm_content=readme)

---

## Quick Start

Here's a simple example to get you started quickly:

```python
from apiverve_placeholdertextgenerator.apiClient import PlaceholdertextAPIClient

# Initialize the client with your APIVerve API key
api = PlaceholdertextAPIClient("[YOUR_API_KEY]")

query = {
    "style": "lorem",
    "paragraphs": 3,
    "sentences": 5
}

try:
    # Make the API call
    result = api.execute(query)

    # Print the result
    print(result)
except Exception as e:
    print(f"Error: {e}")
```

---

## Usage

The Placeholder Text Generator API documentation is found here: [https://docs.apiverve.com/ref/placeholdertext](https://docs.apiverve.com/ref/placeholdertext?utm_source=pypi&utm_medium=referral&utm_content=readme).
You can find parameters, example responses, and status codes documented here.

### Setup

```python
# Import the client module
from apiverve_placeholdertextgenerator.apiClient import PlaceholdertextAPIClient

# Initialize the client with your APIVerve API key
api = PlaceholdertextAPIClient("[YOUR_API_KEY]")
```

---

## Perform Request

Using the API client, you can perform requests to the API.

###### Define Query

```python
query = {
    "style": "lorem",
    "paragraphs": 3,
    "sentences": 5
}
```

###### Simple Request

```python
# Make a request to the API
result = api.execute(query)

# Print the result
print(result)
```

###### Example Response

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

---

## Error Handling

The API client provides comprehensive error handling through the `PlaceholdertextAPIClientError` exception. Here are some examples:

### Basic Error Handling

```python
from apiverve_placeholdertextgenerator.apiClient import PlaceholdertextAPIClient, PlaceholdertextAPIClientError

api = PlaceholdertextAPIClient("[YOUR_API_KEY]")

query = {
    "style": "lorem",
    "paragraphs": 3,
    "sentences": 5
}

try:
    result = api.execute(query)
    print("Success!")
    print(result)
except PlaceholdertextAPIClientError as e:
    print(f"API Error: {e.message}")
    if e.status_code:
        print(f"Status Code: {e.status_code}")
    if e.response:
        print(f"Response: {e.response}")
```

### Handling Specific Error Types

```python
from apiverve_placeholdertextgenerator.apiClient import PlaceholdertextAPIClient, PlaceholdertextAPIClientError

api = PlaceholdertextAPIClient("[YOUR_API_KEY]")

query = {
    "style": "lorem",
    "paragraphs": 3,
    "sentences": 5
}

try:
    result = api.execute(query)

    # Check for successful response
    if result.get('status') == 'success':
        print("Request successful!")
        print(result.get('data'))
    else:
        print(f"API returned an error: {result.get('error')}")

except PlaceholdertextAPIClientError as e:
    # Handle API client errors
    if e.status_code == 401:
        print("Unauthorized: Invalid API key")
    elif e.status_code == 429:
        print("Rate limit exceeded")
    elif e.status_code >= 500:
        print("Server error - please try again later")
    else:
        print(f"API error: {e.message}")
except Exception as e:
    # Handle unexpected errors
    print(f"Unexpected error: {str(e)}")
```

### Using Context Manager (Recommended)

The client supports the context manager protocol for automatic resource cleanup:

```python
from apiverve_placeholdertextgenerator.apiClient import PlaceholdertextAPIClient, PlaceholdertextAPIClientError

query = {
    "style": "lorem",
    "paragraphs": 3,
    "sentences": 5
}

# Using context manager ensures proper cleanup
with PlaceholdertextAPIClient("[YOUR_API_KEY]") as api:
    try:
        result = api.execute(query)
        print(result)
    except PlaceholdertextAPIClientError as e:
        print(f"Error: {e.message}")
# Session is automatically closed here
```

---

## Advanced Features

### Debug Mode

Enable debug logging to see detailed request and response information:

```python
from apiverve_placeholdertextgenerator.apiClient import PlaceholdertextAPIClient

# Enable debug mode
api = PlaceholdertextAPIClient("[YOUR_API_KEY]", debug=True)

query = {
    "style": "lorem",
    "paragraphs": 3,
    "sentences": 5
}

# Debug information will be printed to console
result = api.execute(query)
```

### Manual Session Management

If you need to manually manage the session lifecycle:

```python
from apiverve_placeholdertextgenerator.apiClient import PlaceholdertextAPIClient

api = PlaceholdertextAPIClient("[YOUR_API_KEY]")

query = {
    "style": "lorem",
    "paragraphs": 3,
    "sentences": 5
}

try:
    result = api.execute(query)
    print(result)
finally:
    # Manually close the session when done
    api.close()
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=pypi&utm_medium=referral&utm_content=readme).

---

## Updates
Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=pypi&utm_medium=referral&utm_content=readme) and all legal documents and agreements.

---

## License
Licensed under the MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
