# Placeholder Text Generator API - Ruby Gem

Placeholder Text Generator creates custom placeholder text and dummy copy across themes like lorem ipsum, tech, and corporate. Set the paragraph count, sentences per paragraph, and style to receive an array of generated text blocks.

## Installation

Add this line to your application's Gemfile:

```ruby
gem 'apiverve_placeholdertext'
```

And then execute:

```bash
$ bundle install
```

Or install it yourself as:

```bash
$ gem install apiverve_placeholdertext
```

## Getting Started

Get your API key at [APIVerve](https://apiverve.com)

### Basic Usage

```ruby
require 'apiverve_placeholdertext'

# Initialize the client
client = APIVerve::Placeholdertext::Client.new(api_key: "YOUR_API_KEY")

# Make a request
response = client.execute({
  style: "lorem",
  paragraphs: 3,
  sentences: 5
})

# Print the response
puts response
```


### Error Handling

```ruby
begin
  response = client.execute({ style: "lorem", paragraphs: 3, sentences: 5 })
  puts response["data"]
rescue APIVerve::Placeholdertext::ValidationError => e
  puts "Validation error: #{e.errors.join(', ')}"
rescue APIVerve::Placeholdertext::APIError => e
  puts "API error: #{e.message}"
  puts "Status code: #{e.status_code}"
end
```

### Debug Mode

```ruby
# Enable debug logging
client = APIVerve::Placeholdertext::Client.new(
  api_key: "YOUR_API_KEY",
  debug: true
)
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

## Documentation

For more information, visit the [API Documentation](https://docs.apiverve.com/ref/placeholdertext?utm_source=rubygems&utm_medium=referral&utm_content=readme).

## Support

- Website: [https://apiverve.com/marketplace/placeholdertext?utm_source=ruby&utm_medium=referral&utm_content=readme](https://apiverve.com/marketplace/placeholdertext?utm_source=ruby&utm_medium=referral&utm_content=readme)
- Email: hello@apiverve.com

## License

This gem is available under the [MIT License](LICENSE).
