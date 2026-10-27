Pod::Spec.new do |s|
  s.name             = 'APIVervePlaceholderTextGenerator'
  s.version          = '1.2.3'
  s.summary          = 'Placeholder Text Generator creates custom placeholder text and dummy copy across themes like lorem ipsum, tech, and corporate.'
  s.description      = <<-'DESC'
Placeholder Text Generator creates custom placeholder text and dummy copy across themes like lorem ipsum, tech, and corporate. Set the paragraph count, sentences per paragraph, and style to receive an array of generated text blocks.

This iOS/macOS SDK provides a convenient way to access the Placeholder Text Generator from APIVerve.
Supports both callback-based and async/await patterns.
                       DESC

  s.homepage         = 'https://apiverve.com/marketplace/placeholdertext?utm_source=cocoapods&utm_medium=referral&utm_content=homepage'
  s.license          = { :type => 'MIT', :file => 'LICENSE' }
  s.author           = { 'APIVerve' => 'hello@apiverve.com' }
  # The SDK repo holds every language; the pod lives under cocoapods/ with its own tag.
  s.source           = { :git => 'https://github.com/apiverve/placeholdertext-api.git', :tag => "cocoapods/v#{s.version}" }

  s.ios.deployment_target = '15.0'
  s.osx.deployment_target = '12.0'

  s.swift_version = '5.0'

  s.source_files = 'cocoapods/Sources/APIVervePlaceholderTextGenerator/**/*.swift'

  s.frameworks = 'Foundation'

  # APIResponse, APIVerveError and the request plumbing, shared by every APIVerve pod.
  s.dependency 'APIVerveCore', '~> 1.2'
end
