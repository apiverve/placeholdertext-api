/// Response models for the Placeholder Text Generator API.

/// API Response wrapper.
class PlaceholdertextResponse {
  final String status;
  final dynamic error;
  final PlaceholdertextData? data;

  /// Set only when the current plan locks one or more fields; null otherwise.
  final PremiumInfo? premium;

  PlaceholdertextResponse({
    required this.status,
    this.error,
    this.data,
    this.premium,
  });

  factory PlaceholdertextResponse.fromJson(Map<String, dynamic> json) => PlaceholdertextResponse(
    status: json['status'] as String? ?? '',
    error: json['error'],
    data: json['data'] != null ? PlaceholdertextData.fromJson(json['data']) : null,
    premium: json['premium'] != null ? PremiumInfo.fromJson(json['premium']) : null,
  );

  Map<String, dynamic> toJson() => {
    'status': status,
    if (error != null) 'error': error,
    if (data != null) 'data': data,
    if (premium != null) 'premium': premium!.toJson(),
  };
}

/// Describes fields the current plan does not unlock. Locked fields arrive as null
/// in [data], and [lockedFields] names them (nested ones use dot paths).
class PremiumInfo {
  final String? message;
  final String? upgradeUrl;
  final List<String>? lockedFields;

  PremiumInfo({this.message, this.upgradeUrl, this.lockedFields});

  factory PremiumInfo.fromJson(Map<String, dynamic> json) => PremiumInfo(
    message: json['message'] as String?,
    upgradeUrl: json['upgrade_url'] as String?,
    lockedFields: (json['locked_fields'] as List?)?.map((e) => e.toString()).toList(),
  );

  Map<String, dynamic> toJson() => {
    if (message != null) 'message': message,
    if (upgradeUrl != null) 'upgrade_url': upgradeUrl,
    if (lockedFields != null) 'locked_fields': lockedFields,
  };
}

/// Response data for the Placeholder Text Generator API.

class PlaceholdertextData {
  String? style;
  List<String>? paragraphs;
  num? paragraphCount;
  num? sentencesPerParagraph;
  num? totalSentences;
  num? totalWords;
  num? totalCharacters;
  String? fullText;

  PlaceholdertextData({
    this.style,
    this.paragraphs,
    this.paragraphCount,
    this.sentencesPerParagraph,
    this.totalSentences,
    this.totalWords,
    this.totalCharacters,
    this.fullText,
  });

  factory PlaceholdertextData.fromJson(Map<String, dynamic> json) => PlaceholdertextData(
      style: json['style'],
      paragraphs: (json['paragraphs'] as List?)?.cast<String>(),
      paragraphCount: json['paragraph_count'],
      sentencesPerParagraph: json['sentences_per_paragraph'],
      totalSentences: json['total_sentences'],
      totalWords: json['total_words'],
      totalCharacters: json['total_characters'],
      fullText: json['full_text'],
    );
}

class PlaceholdertextRequest {
  String? style;
  int? paragraphs;
  int? sentences;

  PlaceholdertextRequest({
    this.style,
    this.paragraphs,
    this.sentences,
  });

  Map<String, dynamic> toJson() => {
      if (style != null) 'style': style,
      if (paragraphs != null) 'paragraphs': paragraphs,
      if (sentences != null) 'sentences': sentences,
    };
}
