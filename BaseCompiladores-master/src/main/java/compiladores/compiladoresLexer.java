// Generated from g:/Programming/Programs/BaseCompiladores-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1
 
    package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PuntoComa=1, ParAbierto=2, ParCerrado=3, LlaveAbierta=4, LlaveCerrada=5, 
		Asignacion=6, Coma=7, Suma=8, Resta=9, Multiplicacion=10, Division=11, 
		Modulo=12, Comparacion=13, Numero=14, Entero=15, Si=16, Sino=17, Para=18, 
		Mientras=19, Identificador=20, EspacioBlanco=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Letra", "Digito", "PuntoComa", "ParAbierto", "ParCerrado", "LlaveAbierta", 
			"LlaveCerrada", "Asignacion", "Coma", "Suma", "Resta", "Multiplicacion", 
			"Division", "Modulo", "Comparacion", "Numero", "Entero", "Si", "Sino", 
			"Para", "Mientras", "Identificador", "EspacioBlanco"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "'='", "','", "'+'", "'-'", 
			"'*'", "'/'", "'%'", null, null, "'int'", "'if'", "'else'", "'for'", 
			"'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PuntoComa", "ParAbierto", "ParCerrado", "LlaveAbierta", "LlaveCerrada", 
			"Asignacion", "Coma", "Suma", "Resta", "Multiplicacion", "Division", 
			"Modulo", "Comparacion", "Numero", "Entero", "Si", "Sino", "Para", "Mientras", 
			"Identificador", "EspacioBlanco"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000eS\b\u000e\u0001\u000f\u0004\u000fV\b\u000f\u000b\u000f\f\u000f"+
		"W\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0003\u0015r\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"w\b\u0015\n\u0015\f\u0015z\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0000\u0000\u0017\u0001\u0000\u0003\u0000\u0005\u0001\u0007"+
		"\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015"+
		"\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011"+
		"\'\u0012)\u0013+\u0014-\u0015\u0001\u0000\u0004\u0002\u0000AZaz\u0001"+
		"\u000009\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u0084\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000"+
		"\u00031\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u00075"+
		"\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b9\u0001\u0000"+
		"\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000"+
		"\u0011?\u0001\u0000\u0000\u0000\u0013A\u0001\u0000\u0000\u0000\u0015C"+
		"\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019G\u0001\u0000"+
		"\u0000\u0000\u001bI\u0001\u0000\u0000\u0000\u001dR\u0001\u0000\u0000\u0000"+
		"\u001fU\u0001\u0000\u0000\u0000!Y\u0001\u0000\u0000\u0000#]\u0001\u0000"+
		"\u0000\u0000%`\u0001\u0000\u0000\u0000\'e\u0001\u0000\u0000\u0000)i\u0001"+
		"\u0000\u0000\u0000+q\u0001\u0000\u0000\u0000-{\u0001\u0000\u0000\u0000"+
		"/0\u0007\u0000\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0007\u0001"+
		"\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005;\u0000\u00004\u0006"+
		"\u0001\u0000\u0000\u000056\u0005(\u0000\u00006\b\u0001\u0000\u0000\u0000"+
		"78\u0005)\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005{\u0000\u0000"+
		":\f\u0001\u0000\u0000\u0000;<\u0005}\u0000\u0000<\u000e\u0001\u0000\u0000"+
		"\u0000=>\u0005=\u0000\u0000>\u0010\u0001\u0000\u0000\u0000?@\u0005,\u0000"+
		"\u0000@\u0012\u0001\u0000\u0000\u0000AB\u0005+\u0000\u0000B\u0014\u0001"+
		"\u0000\u0000\u0000CD\u0005-\u0000\u0000D\u0016\u0001\u0000\u0000\u0000"+
		"EF\u0005*\u0000\u0000F\u0018\u0001\u0000\u0000\u0000GH\u0005/\u0000\u0000"+
		"H\u001a\u0001\u0000\u0000\u0000IJ\u0005%\u0000\u0000J\u001c\u0001\u0000"+
		"\u0000\u0000KL\u0005=\u0000\u0000LS\u0005=\u0000\u0000MS\u0007\u0002\u0000"+
		"\u0000NO\u0005>\u0000\u0000OS\u0005=\u0000\u0000PQ\u0005<\u0000\u0000"+
		"QS\u0005=\u0000\u0000RK\u0001\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000"+
		"RN\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S\u001e\u0001\u0000"+
		"\u0000\u0000TV\u0003\u0003\u0001\u0000UT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X \u0001\u0000\u0000\u0000YZ\u0005i\u0000\u0000Z[\u0005n\u0000\u0000["+
		"\\\u0005t\u0000\u0000\\\"\u0001\u0000\u0000\u0000]^\u0005i\u0000\u0000"+
		"^_\u0005f\u0000\u0000_$\u0001\u0000\u0000\u0000`a\u0005e\u0000\u0000a"+
		"b\u0005l\u0000\u0000bc\u0005s\u0000\u0000cd\u0005e\u0000\u0000d&\u0001"+
		"\u0000\u0000\u0000ef\u0005f\u0000\u0000fg\u0005o\u0000\u0000gh\u0005r"+
		"\u0000\u0000h(\u0001\u0000\u0000\u0000ij\u0005w\u0000\u0000jk\u0005h\u0000"+
		"\u0000kl\u0005i\u0000\u0000lm\u0005l\u0000\u0000mn\u0005e\u0000\u0000"+
		"n*\u0001\u0000\u0000\u0000or\u0003\u0001\u0000\u0000pr\u0005_\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000rx\u0001\u0000\u0000"+
		"\u0000sw\u0003\u0001\u0000\u0000tw\u0003\u0003\u0001\u0000uw\u0005_\u0000"+
		"\u0000vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000"+
		"\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y,\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"{|\u0007\u0003\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0006\u0016\u0000"+
		"\u0000~.\u0001\u0000\u0000\u0000\u0006\u0000RWqvx\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}