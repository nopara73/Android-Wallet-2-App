package info.blockchain.wallet.ui;

import java.util.Random;

public class RandomPasswordGenerator	{

	private static String[] words = { 
		"aahed",
		"aargh","abaca","aback","abaft","abaka","abamp","abase","abash","abate","abaya",
		"abbas","abbes","abbey","abeam","abets","abuse","abuts","abuzz","abyes","abysm",
		"abyss","acerb","aceta","ached","aches","ackee","acmes","acned","acnes","acred",
		"acres","acted","acute","adage","adapt","addax","added","adder","adeem","adept",
		"adman","admen","adunc","adust","adyta","adzed","adzes","aedes","afars","after",
		"agama","agape","agars","agate","agave","agaze","agene","agent","agers","agger",
		"aghas","agmas","agree","agues","ahead","ajuga","akees","akene","amahs","amass",
		"amaze","amber","ambry","ameba","ameer","amend","amens","ament","amped","amuck",
		"amuse","anear","anent","angas","anger","angry","angst","ankhs","ankus","annas",
		"annex","ansae","antae","antas","anted","antes","antra","antre","antsy","apace",
		"apart","apeak","apeek","apers","apery","apnea","apres","apses","apter","aquae",
		"aquas","araks","arame","arced","arcus","ardeb","areae","areas","areca","arena",
		"arene","arepa","arete","argue","argus","arhat","armed","armer","armet","arpen",
		"arras","array","arses","artsy","arums","asana","ascus","ashed","ashen","ashes",
		"asked","asker","askew","aspen","asper","assay","asses","asset","aster","ataps",
		"ataxy","atman","atmas","attar","audad","auger","aught","augur","aunts","aunty",
		"aurae","aurar","auras","aures","aurum","avant","avast","avens","avers","avert",
		"avgas","awake","award","aware","awash","awned","axman","axmen","ayahs","azans",
		"azure","baaed","babas","babes","babka","babus","bacca","backs","baddy","badge",
		"baffs","baffy","baggy","bahts","baked","baker","bakes","banda","bands","bandy",
		"baned","banes","bangs","banks","banns","banty","barbe","barbs","barca","barde",
		"bards","bared","barer","bares","barfs","barge","barks","barky","barms","barmy",
		"barns","barny","barre","barye","based","baser","bases","basks","bassy","baste",
		"basts","batch","bated","bates","bathe","baths","batts","battu","batty","bauds",
		"bawds","bawdy","bawty","bayed","bazar","beach","beads","beady","beaks","beaky",
		"beams","beamy","beans","beard","bears","beast","beats","beaus","beaut","beaux",
		"becap","becks","bedew","beech","beefs","beefy","beeps","beers","beery","beets",
		"began","begat","beget","begum","begun","bemas","bench","bends","bendy","benes",
		"benne","benny","bents","beret","bergs","berks","berme","berms","berry","berth",
		"beses","beset","bests","betas","beths","betta","bhang","bhuts","brace","brach",
		"bract","brads","braes","brags","brake","braky","brand","brank","brans","brant",
		"brash","brass","brats","brava","brave","brawn","braws","braxy","brays","braza",
		"braze","bread","break","bream","brede","breed","brees","brens","brent","breve",
		"brews","brugh","brume","brung","brunt","brush","brusk","brute","bruts","bubba",
		"bubby","bubus","bucks","buddy","budge","buffs","buffy","buggy","buhrs","bumfs",
		"bumph","bumps","bumpy","bunas","bunch","bunds","bundt","bungs","bunks","bunns",
		"bunny","bunts","bunya","buppy","buran","buras","burbs","burds","buret","burgh",
		"burgs","burka","burke","burns","burnt","burps","burqa","burrs","burry","bursa",
		"burse","burst","busby","bused","buses","bushy","busks","busts","busty","butch",
		"butes","butte","butts","butty","butut","buyer","bwana","byres","bytes","byway",
		"cabby","caber","cacas","cache","caddy","cades","cadet","cadge","cadgy","cadre",
		"caeca","cafes","caffs","caged","cager","cages","cagey","caked","cakes","cakey",
		"camas","cames","camps","campy","candy","caned","caner","canes","canna","canny",
		"canst","cants","canty","caped","caper","capes","caphs","caput","carat","carbs",
		"cards","cared","carer","cares","caret","carex","carks","carns","carny","carps",
		"carrs","carry","carse","carte","carts","carve","casas","cased","cases","casks",
		"casky","caste","casts","casus","catch","cater","cates","catty","cause","caved",
		"caver","caves","cawed","cease","cecum","cedar","ceded","ceder","cedes","cense",
		"cents","centu","cepes","cered","ceres","cesta","cetes","chads","chafe","chaff",
		"champ","chams","chang","chant","chape","chaps","chapt","chard","chare","chark",
		"charm","charr","chars","chart","chary","chase","chasm","chats","chaws","chays",
		"cheap","cheat","check","cheek","cheep","cheer","chefs","chert","chess","chest",
		"cheth","chevy","chews","chewy","chubs","chuck","chufa","chuff","chugs","chump",
		"chums","chunk","churn","churr","chute","chyme","crabs","crack","craft","crags",
		"crake","cramp","crams","crane","crank","crape","craps","crash","crass","crate",
		"crave","craws","craze","crazy","creak","cream","creds","creed","creek","creep",
		"creme","crepe","crept","crepy","cress","crest","crews","cruck","crude","cruds",
		"cruet","crumb","crump","crura","cruse","crush","crust","crwth","crypt","cubby",
		"cubeb","cubed","cuber","cubes","cuddy","cuffs","cukes","cunts","cuppa","cuppy",
		"curbs","curch","curds","curdy","cured","curer","cures","curet","curfs","curns",
		"currs","curry","curse","curst","curve","curvy","cusec","cushy","cusks","cusps",
		"cutch","cuter","cutes","cutey","cutty","cutup","cuvee","cyans","cyber","cycad",
		"cycas","cyder","cymae","cymar","cymas","cymes","cysts","czars","daces","dacha",
		"dadas","daddy","daffs","daffy","dagga","daman","damar","dames","damns","damps",
		"dance","dandy","dangs","darbs","dared","darer","dares","darks","darky","darns",
		"darts","dashy","dated","dater","dates","datum","daube","daubs","dauby","daunt",
		"dauts","daven","dawed","dawen","dawks","dawns","dawts","dazed","dazes","deads",
		"deans","dears","deary","deash","death","deave","debag","debar","debts","debug",
		"debut","debye","decaf","decay","decks","decry","deeds","deedy","deems","deeps",
		"deers","deets","defat","defer","degas","degum","deked","dekes","demes","demur",
		"denar","denes","dense","dents","depth","derat","deray","derby","derma","derms",
		"derry","desex","desks","deter","deuce","devas","dewan","dewar","dewax","dewed",
		"dexes","dhaks","drabs","draff","draft","drags","drake","drama","drams","drank",
		"drape","drats","drave","drawn","draws","drays","dread","dream","drear","dreck",
		"dreed","drees","dregs","dreks","dress","drest","drubs","drugs","drums","drunk",
		"drupe","druse","dryad","dryer","duads","ducat","duces","duchy","ducks","ducky",
		"ducts","duddy","duded","dudes","duets","duffs","dufus","duked","dukes","dumas",
		"dumbs","dumka","dumky","dummy","dumps","dumpy","dunam","dunce","dunch","dunes",
		"dungs","dungy","dunks","dunts","duped","duper","dupes","duras","dured","dures",
		"durns","durra","durrs","durst","durum","dusks","dusky","dusts","dusty","dutch",
		"duvet","dwarf","dweeb","dyads","dyers","dyked","dykes","dykey","dynes","eager",
		"eagre","eared","earns","earth","eased","eases","easts","eaten","eater","eaved",
		"eaves","ebbed","ebbet","eched","eches","ecrus","edema","edged","edger","edges",
		"educe","educt","egads","egers","egest","eggar","egged","egger","egret","eject",
		"embar","embay","embed","ember","emcee","emeer","emend","emery","emeus","emmer",
		"emmet","emmys","empty","emyde","emyds","enact","enate","ended","ender","endue",
		"enema","enemy","ensky","ensue","enter","entry","enure","enzym","epact","epees",
		"ephah","ephas","erase","erect","ernes","erred","erses","eruct","erupt","escar",
		"eskar","esker","esnes","essay","esses","ester","etape","ether","etnas","etude",
		"etwee","etyma","evade","evens","event","evert","every","ewers","exact","exams",
		"execs","exert","expat","extra","exude","exurb","eyass","eyers","eyras","eyres",
		"faced","facer","faces","facet","facts","faddy","faded","fader","fades","fadge",
		"faena","faery","faggy","faked","faker","fakes","fakey","famed","fames","fancy",
		"fanes","fanga","fangs","fanny","fanum","farad","farce","farcy","fards","fared",
		"farer","fares","farms","farts","fasts","fated","fates","fatty","fatwa","faugh",
		"fauna","fauns","fauve","favas","faves","favus","fawns","fawny","faxed","faxes",
		"fayed","fazed","fazes","fears","fease","feast","feats","feaze","feces","fecks",
		"fedex","feebs","feeds","feeze","femes","femme","femur","fence","fends","fenny",
		"feres","ferns","ferny","ferry","fesse","fests","fetas","fetch","feted","fetes",
		"fetus","feuar","feuds","feued","fever","fewer","feyer","fezes","fezzy","frags",
		"frame","franc","frank","fraps","frass","frats","fraud","frays","freak","freed",
		"freer","frees","fremd","frena","frere","fresh","frets","frugs","frump","fryer",
		"fubar","fubsy","fucks","fucus","fuddy","fudge","fuggy","fugue","fugus","fumed",
		"fumer","fumes","fumet","funds","funks","funky","funny","furan","furry","furze",
		"furzy","fused","fusee","fuses","fussy","fusty","fuzed","fuzee","fuzes","fuzzy",
		"fyces","fykes","fytte","gabby","gadje","gaffe","gaffs","gaged","gager","gages",
		"gamas","gamay","gamba","gambe","gambs","gamed","gamer","games","gamey","gamma",
		"gammy","gamps","gamut","ganef","ganev","gangs","ganja","gaped","gaper","gapes",
		"gappy","garbs","garda","garth","gases","gasps","gassy","gasts","gated","gater",
		"gates","gauds","gaudy","gauge","gaums","gaunt","gaurs","gauss","gauze","gauzy",
		"gawks","gawky","gawps","gawsy","gayer","gazar","gazed","gazer","gazes","gears",
		"gecks","geeks","geeky","geese","geest","gemma","gemmy","genes","genet","genre",
		"gents","genua","genus","gerah","germs","germy","geste","gests","getas","getup",
		"geums","ghast","ghats","ghaut","ghees","gnarr","gnars","gnash","gnats","gnawn",
		"gnaws","grabs","grace","grade","grads","graft","grama","gramp","grams","grana",
		"grand","grans","grant","grape","graph","grapy","grasp","grass","grate","grave",
		"gravy","grays","graze","great","grebe","greed","greek","green","grees","greet",
		"greys","grubs","grues","gruff","grume","grump","grunt","guans","guard","guars",
		"guava","gucks","gudes","guess","guest","guffs","gumma","gummy","gunks","gunky",
		"gunny","guppy","gurge","gurry","gursh","gurus","gushy","gussy","gusts","gusty",
		"gutsy","gutta","gutty","guyed","gybed","gybes","gypsy","gyred","gyres","gyrus",
		"gyved","gyves","haafs","haars","habus","hacek","hacks","haded","hades","hadst",
		"haems","haets","hafts","hahas","hajes","hakes","hakus","hames","hammy","hamza",
		"hance","hands","handy","hangs","hanks","hanky","hansa","hanse","hants","hapax",
		"happy","hards","hardy","hared","harem","hares","harks","harms","harps","harpy",
		"harry","harsh","harts","hasps","haste","hasty","hatch","hated","hater","hates",
		"haugh","haunt","haute","haven","haver","haves","hawed","hawks","hawse","hayed",
		"hayer","hayey","hazan","hazed","hazer","hazes","heads","heady","heaps","heapy",
		"heard","hears","heart","heath","heats","heave","heavy","hebes","hecks","heder",
		"hedge","hedgy","heeds","heeze","hefts","hefty","hemes","hemps","hempy","hence",
		"henge","henna","henry","hents","herbs","herby","herds","heres","herma","herms",
		"herns","herry","hertz","hests","heths","heuch","heugh","hewed","hewer","hexad",
		"hexed","hexer","hexes","hubby","hucks","huffs","huffy","huger","human","humph",
		"humps","humpy","humus","hunch","hunks","hunky","hunts","hurds","hurry","hurst",
		"hurts","husks","husky","hussy","hutch","huzza","hydra","hyena","hymen","hymns",
		"hyped","hyper","hypes","hypha","hyrax","jacks","jacky","jaded","jades","jager",
		"jaggs","jaggy","jagra","jakes","jambe","jambs","jammy","janes","janty","japan",
		"japed","japer","japes","jauks","jaunt","jaups","javas","jawan","jawed","jazzy",
		"jeans","jeeps","jeers","jefes","jehad","jehus","jemmy","jenny","jerks","jerky",
		"jerry","jesse","jests","jetes","jetty","jewed","jnana","jubas","jubes","judas",
		"judge","jugum","jujus","juked","jukes","jukus","jumps","jumpy","junks","junky",
		"junta","jupes","jurat","justs","jutes","jutty","kabab","kabar","kagus","kakas",
		"kames","kanas","kanes","kanzu","kapas","kaphs","kappa","kaput","karat","karma",
		"karns","karst","karts","kasha","katas","kaury","kavas","kayak","kbars","kebab",
		"kebar","kecks","kedge","keefs","keeks","keens","keeps","keets","keeve","kemps",
		"kempt","kenaf","kench","kente","kerbs","kerfs","kerne","kerns","kerry","ketch",
		"kexes","keyed","khafs","khans","khaph","khats","kheda","kheth","khets","knack",
		"knaps","knars","knaur","knave","knawe","knead","kneed","knees","knurs","kraft",
		"kraut","kreep","krewe","kudus","kudzu","kumys","kurta","kurus","kvass","kyack",
		"kyaks","kyars","kyats","kytes","kythe","maars","mabes","macaw","maced","macer",
		"maces","mache","machs","macks","madam","madre","mages","magma","magus","makar",
		"maker","makes","mamas","mamba","mamey","mamma","mammy","manas","manat","maned",
		"manes","manga","mange","mangy","manna","manse","manta","manus","maras","march",
		"marcs","mares","marge","marka","marks","marry","marse","marsh","marts","marvy",
		"masas","maser","mashy","masks","massa","masse","massy","masts","match","mated",
		"mater","mates","matey","maths","matte","matts","matza","mauds","maund","mauts",
		"mauve","maven","mawed","maxed","maxes","mayan","mayas","maybe","mayed","mayst",
		"mazed","mazer","mazes","meads","means","meant","meany","meats","meaty","mecca",
		"meeds","meets","memes","menad","mends","mensa","mense","mensh","menta","menus",
		"merch","mercs","mercy","merde","merer","meres","merge","merks","merry","mesas",
		"meshy","mesne","messy","meted","meter","metes","meths","metre","mewed","mezes",
		"mucks","mucky","mucus","muddy","mudra","muffs","muggs","muggy","mumms","mummy",
		"mumps","mumus","munch","muras","mured","mures","murex","murks","murky","murra",
		"murre","murrs","murry","musca","mused","muser","muses","mushy","musks","musky",
		"mussy","musth","musts","musty","mutch","muted","muter","mutes","mutts","muzzy",
		"mynah","mynas","myrrh","myths","mythy","naans","nabes","nacre","nadas","naffs",
		"naggy","naked","nakfa","named","namer","names","nanas","nance","nancy","nanny",
		"napas","napes","nappa","nappe","nappy","narcs","nards","nares","narks","narky",
		"nasty","natch","nates","natty","navar","naves","navvy","nawab","neaps","nears",
		"neath","neats","necks","neddy","needs","needy","neems","neeps","negus","nemas",
		"nenes","nerds","nerdy","nerts","nertz","nerve","nervy","nests","netts","netty",
		"neuks","neume","neums","never","neves","nevus","newer","newsy","newts","nexus",
		"ngwee","nubby","nucha","nuder","nudes","nudge","nudzh","nuked","nukes","numbs",
		"numen","nurds","nurse","nutsy","nutty","nymph","pacas","paced","pacer","paces",
		"pacey","pacha","packs","pacts","paddy","padre","paean","pagan","paged","pager",
		"pages","pampa","panda","pandy","paned","panes","panga","pangs","panne","pansy",
		"pants","panty","papas","papaw","paper","pappy","parae","paras","parch","pards",
		"pardy","pared","parer","pares","pareu","parge","parka","parks","parrs","parry",
		"parse","parts","party","parve","pases","pasha","passe","pasta","paste","pasts",
		"pasty","patch","pated","paten","pater","pates","paths","patsy","patty","pause",
		"pavan","paved","paver","paves","pawed","pawer","pawky","pawns","paxes","payed",
		"payee","payer","peace","peach","peage","peags","peaks","peaky","peans","pears",
		"peart","pease","peats","peaty","peavy","pecan","pechs","pecks","pecky","pedes",
		"peeks","peens","peeps","peers","peery","peeve","pekan","pekes","pence","pends",
		"penes","penna","penne","penny","peppy","perch","perdu","perdy","perea","peres",
		"perks","perky","perms","perps","perry","perse","pervs","pesky","pests","pesty",
		"peter","petty","pewee","phage","phase","phpht","phuts","praam","prahu","prams",
		"prang","prank","prase","prate","prats","praus","prawn","prays","preed","preen",
		"prees","preps","presa","prese","press","prest","prexy","preys","prude","prune",
		"pruta","pryer","pseud","pshaw","psych","pubes","puces","pucka","pucks","pudgy",
		"puffs","puffy","puggy","pujah","pujas","puked","pukes","pukka","pumas","pumps",
		"punas","punch","pungs","punka","punks","punky","punny","punts","punty","pupae",
		"pupas","puppy","pupus","purda","puree","purer","purge","purrs","purse","pursy",
		"purty","puses","pushy","pussy","putts","putty","pygmy","pyran","pyres","pyrex",
		"pyxes","qanat","quack","quads","quaff","quags","quake","quaky","quant","quare",
		"quark","quart","quash","quass","quate","quays","quean","queen","queer","quern",
		"query","quest","queue","queys","qursh","rabat","raced","racer","races","racks",
		"radar","raffs","rafts","ragas","raged","ragee","rages","raggs","raggy","rajah",
		"rajas","rajes","raked","rakee","raker","rakes","rakus","ramee","ramen","ramet",
		"rammy","ramps","ramus","rance","ranch","rands","randy","ranee","range","rangy",
		"ranks","rants","raped","raper","rapes","raphe","rared","rarer","rares","rased",
		"raser","rases","rasps","raspy","ratan","ratch","rated","rater","rates","rathe",
		"ratty","raved","raven","raver","raves","rawer","raxed","raxes","rayah","rayas",
		"rayed","razed","razee","razer","razes","reach","react","readd","reads","ready",
		"reams","reaps","rearm","rears","reata","reave","rebar","rebbe","rebec","rebus",
		"rebut","rebuy","recap","recce","recks","recta","recur","recut","redan","redds",
		"reded","redes","redry","redub","redux","redye","reeds","reedy","reefs","reefy",
		"reeks","reeky","reest","reeve","refed","refer","refry","reges","regma","regna",
		"rehab","rehem","rekey","reman","remap","remet","remex","rends","renew","rente",
		"rents","repay","repeg","repps","reran","rerun","resat","resaw","resay","resee",
		"reset","resew","rests","retag","retax","retch","retem","retry","reuse","revet",
		"revue","rewan","rewax","rewed","rewet","rexes","rheas","rheme","rheum","rhumb",
		"rhyme","rhyta","ruana","rubby","rubes","rubus","ruche","rucks","rudds","ruddy",
		"ruder","ruers","ruffe","ruffs","rugae","rugby","rumba","rumen","rummy","rumps",
		"runes","rungs","runny","runts","runty","rupee","ruses","rushy","rusks","rusts",
		"rusty","ruths","rutty","ryked","rykes","rynds","sabed","saber","sabes","sabra",
		"sabre","sacks","sacra","sades","sadhe","sadhu","safer","safes","sagas","sager",
		"sages","saggy","sagum","saker","sakes","samba","samek","samps","sands","sandy",
		"saned","saner","sanes","sanga","sangh","sappy","saran","sards","saree","sarge",
		"sarks","sarky","sassy","satay","sated","satem","sates","satyr","sauce","sauch",
		"saucy","saugh","sauna","saury","saute","saved","saver","saves","savvy","sawed",
		"sawer","saxes","sayed","sayer","sayst","scabs","scads","scags","scamp","scams",
		"scans","scant","scape","scare","scarf","scarp","scars","scart","scary","scats",
		"scatt","scaup","scaur","scena","scend","scene","scent","schav","schwa","scrag",
		"scram","scrap","scree","screw","scrub","scrum","scuba","scuds","scuff","scums",
		"scups","scurf","scuta","scute","scuts","scuzz","seams","seamy","sears","seats",
		"sebum","sects","sedan","seder","sedge","sedgy","sedum","seeds","seedy","seeks",
		"seems","seeps","seepy","seers","segue","semen","semes","sends","senna","sensa",
		"sense","sente","septa","septs","serac","sered","serer","seres","serfs","serge",
		"serry","serum","serve","setae","setts","setup","seven","sever","sewan","sewar",
		"sewed","sewer","sexed","sexes","sexts","shack","shade","shads","shady","shaft",
		"shags","shahs","shake","shaky","shame","shams","shank","shape","shard","share",
		"shark","sharn","sharp","shave","shawm","shawn","shaws","shays","sheaf","shear",
		"sheas","sheds","sheen","sheep","sheer","sheet","shend","shent","sherd","shewn",
		"shews","shred","shrew","shrub","shrug","shuck","shuns","shunt","shush","shute",
		"shuts","shwas","shyer","skags","skank","skate","skats","skean","skeed","skeen",
		"skees","skeet","skegs","skene","skeps","skews","skuas","skunk","skyed","skyey",
		"smack","smarm","smart","smash","smaze","smear","smeek","smerk","smews","smush",
		"smuts","snack","snafu","snags","snake","snaky","snaps","snare","snarf","snark",
		"snash","snath","snaws","sneak","sneap","sneck","sneds","sneer","snubs","snuck",
		"snuff","snugs","snyes","space","spacy","spade","spaed","spaes","spake","spams",
		"spang","spank","spans","spare","spark","spars","spasm","spate","spats","spawn",
		"spays","spazz","speak","spean","spear","speck","specs","speed","speer","spend",
		"spent","sperm","spews","sprag","sprat","spray","spree","sprue","sprug","spuds",
		"spued","spues","spume","spumy","spunk","spurn","spurs","spurt","sputa","squab",
		"squad","squat","squaw","squeg","stabs","stack","stade","staff","stage","stags",
		"stagy","stake","stamp","stand","stane","stang","stank","staph","stare","stark",
		"stars","start","stash","state","stats","stave","stays","stead","steak","steam",
		"steed","steek","steep","steer","stems","stent","steps","stere","stern","stets",
		"stews","stewy","strap","straw","stray","strep","strew","strum","strut","stubs",
		"stuck","studs","study","stuff","stump","stums","stung","stunk","stuns","stunt",
		"stupa","stupe","sturt","styed","styes","stymy","suave","subah","subas","suber",
		"sucks","sucky","sucre","sudds","sudsy","suede","suers","suets","suety","sugar",
		"sughs","sumac","summa","sumps","sunna","sunns","sunny","sunup","super","supes",
		"supra","surah","suras","surds","surer","surfs","surfy","surge","surgy","surra",
		"sutra","sutta","swabs","swage","swags","swamp","swamy","swang","swank","swans",
		"swaps","sward","sware","swarf","swarm","swart","swash","swath","swats","sways",
		"swear","sweat","swede","sweep","sweer","sweet","swept","swung","sycee","syces",
		"sykes","synch","syncs","synth","syphs","syren","syrup","tabby","taber","tabes",
		"tabun","tabus","taces","tacet","tache","tachs","tacks","tacky","tacts","taffy",
		"tahrs","tajes","takas","taken","taker","takes","tamed","tamer","tames","tammy",
		"tamps","tanga","tangs","tangy","tanka","tanks","tansy","tapas","taped","taper",
		"tapes","tardy","tared","tares","targe","tarns","tarps","tarre","tarry","tarts",
		"tarty","tasks","tasse","taste","tasty","tatar","tater","tates","tatty","taunt",
		"taupe","tauts","tawed","tawer","tawny","tawse","taxed","taxer","taxes","taxus",
		"tazza","tazze","teach","teaks","teams","tears","teary","tease","teats","techs",
		"techy","tecta","teddy","teems","teens","teeny","teeth","teffs","teggs","tegua",
		"temps","tempt","tench","tends","tendu","tenet","tenge","tense","tenth","tents",
		"tenty","tepas","tepee","terce","terga","terms","terne","terns","terra","terry",
		"terse","testa","tests","testy","teths","tetra","teuch","teugh","tewed","texas",
		"texts","thack","thane","thank","tharm","thaws","thebe","theca","theft","thegn",
		"theme","thens","there","therm","these","thesp","theta","thews","thewy","thraw",
		"three","threw","thrum","thuds","thugs","thuja","thumb","thump","thunk","thuya",
		"thyme","thymy","trace","track","tract","trade","tramp","trams","trank","tranq",
		"trans","traps","trapt","trash","trass","trave","trays","tread","treat","treed",
		"treen","trees","treks","trend","tress","trets","trews","treys","truce","truck",
		"trued","truer","trues","trugs","trump","trunk","truss","trust","truth","tryma",
		"tryst","tsade","tsars","tsked","tsuba","tubae","tubas","tubby","tubed","tuber",
		"tubes","tucks","tufas","tuffs","tufts","tufty","tummy","tumps","tunas","tuned",
		"tuner","tunes","tungs","tunny","tuque","turds","turfs","turfy","turks","turns",
		"turps","tushy","tusks","tutee","tutty","tutus","tuxes","tuyer","twaes","twang",
		"twats","tweak","tweed","tween","tweet","twerp","twyer","tyees","tyers","tykes",
		"tyned","tynes","typed","types","typey","typps","tyred","tyres","tythe","tzars",
		"udder","ukase","umber","umbra","umped","unapt","unarm","unary","unaus","unban",
		"unbar","uncap","uncus","uncut","undee","under","undue","unfed","unhat","unjam",
		"unman","unmet","unmew","unpeg","unpen","unsay","unset","unsew","unsex","unwed",
		"unwet","upbye","updry","upend","upped","upper","upset","urare","urase","urate",
		"urban","ureas","urged","urger","urges","urped","ursae","usage","users","usher",
		"usnea","usque","usurp","usury","utter","uveas","vacua","vague","vagus","vamps",
		"vampy","vanda","vaned","vanes","vangs","varas","varna","varus","varve","vases",
		"vasts","vasty","vatus","vaunt","veena","veeps","veers","veery","vegan","veges",
		"venae","vends","venge","vents","venue","venus","verbs","verge","verse","verst",
		"verts","vertu","verve","vesta","vests","vetch","vexed","vexer","vexes","vuggs",
		"vuggy","vughs","wacke","wacks","wacky","waddy","waded","wader","wades","wafer",
		"waffs","wafts","waged","wager","wages","waked","waken","waker","wakes","wames",
		"wamus","wands","waned","wanes","waney","wanks","wants","wards","wared","wares",
		"warks","warms","warns","warps","warts","warty","washy","wasps","waspy","waste",
		"wasts","watap","watch","water","watts","waugh","wauks","waved","waver","waves",
		"wavey","waxed","waxen","waxer","waxes","weans","wears","weary","weave","webby",
		"weber","wecht","wedge","wedgy","weeds","weedy","weeks","weens","weeny","weeps",
		"weepy","weest","weets","wefts","wekas","wench","wends","wenny","wests","whack",
		"whams","whang","whaps","wharf","whats","whaup","wheat","wheen","wheep","whens",
		"where","whets","whews","wheys","whump","whups","wrack","wrang","wraps","wrapt",
		"wrath","wreak","wreck","wrens","wrest","wrung","wryer","wurst","wushu","wussy",
		"wynds","wynns","wyted","wytes","xebec","xerus","xysts","yabby","yacht","yacks",
		"yaffs","yager","yamen","yamun","yangs","yanks","yards","yarer","yarns","yauds",
		"yaups","yawed","yawey","yawns","yawps","yeahs","yeans","yearn","years","yeast",
		"yecch","yechs","yechy","yeggs","yenta","yente","yerba","yerks","yeses","yetts",
		"yeuks","yeuky","yuans","yucas","yucca","yucch","yucks","yucky","yugas","yukky",
		"yummy","yuppy","yurta","yurts","zanza","zappy","zarfs","zaxes","zazen","zebec",
		"zebra","zebus","zerks","zests","zesty","zetas","zymes"
		};

		private static String[] digits = { "2", "3", "4", "5", "6", "7", "8", "9" };
		
		private static RandomPasswordGenerator instance = null;
		
		private RandomPasswordGenerator()	{ ; }
		
		public static RandomPasswordGenerator getInstance()	{
			
			if(instance == null)	{
				instance = new RandomPasswordGenerator();
			}
			
			return instance;
		}

		public String getPassword()	{

			Random r = new Random();

			int rint1 = r.nextInt(words.length);
			int rint2 = r.nextInt(words.length);

			while(rint1 == rint2)	{
				rint2 = r.nextInt(words.length);
			}

			int rint3 = r.nextInt(digits.length);
			int rint4 = r.nextInt(digits.length);

			return words[rint1] + digits[rint3] + digits[rint4] + words[rint2];
	}

}
