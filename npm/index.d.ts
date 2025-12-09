declare module '@apiverve/placeholdertext' {
  export interface placeholdertextOptions {
    api_key: string;
    secure?: boolean;
  }

  export interface placeholdertextResponse {
    status: string;
    error: string | null;
    data: PlaceholderTextGeneratorData;
    code?: number;
  }


  interface PlaceholderTextGeneratorData {
      style:                 string;
      paragraphs:            string[];
      paragraphCount:        number;
      sentencesPerParagraph: number;
      totalSentences:        number;
      totalWords:            number;
      totalCharacters:       number;
      fullText:              string;
      availableStyles:       string[];
  }

  export default class placeholdertextWrapper {
    constructor(options: placeholdertextOptions);

    execute(callback: (error: any, data: placeholdertextResponse | null) => void): Promise<placeholdertextResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: placeholdertextResponse | null) => void): Promise<placeholdertextResponse>;
    execute(query?: Record<string, any>): Promise<placeholdertextResponse>;
  }
}
