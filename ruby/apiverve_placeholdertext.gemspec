# frozen_string_literal: true

Gem::Specification.new do |spec|
  spec.name          = "apiverve_placeholdertext"
  spec.version       = "1.2.2"
  spec.authors       = ["APIVerve"]
  spec.email         = ["hello@apiverve.com"]

  spec.summary       = "Placeholder Text Generator API - Ruby Client"
  spec.description   = "Placeholder Text Generator creates custom placeholder text and dummy copy across themes like lorem ipsum, tech, and corporate. Set the paragraph count, sentences per paragraph, and style to receive an array of generated text blocks."
  spec.homepage      = "https://apiverve.com/marketplace/placeholdertext?utm_source=ruby&utm_medium=referral&utm_content=homepage"
  spec.license       = "MIT"
  spec.required_ruby_version = ">= 2.7.0"

  spec.metadata["homepage_uri"] = spec.homepage
  spec.metadata["source_code_uri"] = "https://github.com/apiverve/placeholdertext-API/tree/main/ruby"
  spec.metadata["changelog_uri"] = "https://apiverve.com/changelog"
  spec.metadata["documentation_uri"] = "https://docs.apiverve.com/ref/placeholdertext"

  spec.files = Dir.glob("{lib}/**/*") + %w[README.md LICENSE]
  spec.require_paths = ["lib"]

  spec.add_dependency "faraday", ">= 1.0", "< 3.0"
  spec.add_dependency "faraday-multipart", "~> 1.0"
  spec.add_dependency "json", "~> 2.0"
end
