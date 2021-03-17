
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object renderPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[meerkat.PageGenerator.Article],List[meerkat.MeerkatControllerTypes.CandidateGenerateeId],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(articles: List[meerkat.PageGenerator.Article], headlines: List[meerkat.MeerkatControllerTypes.CandidateGenerateeId]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href='./public/stylesheets/plugins.css' rel="stylesheet" type="text/css" />
<link href='./public/stylesheets/style.css' rel="stylesheet" type="text/css"/>
<style type="text/css">
#freecssfooter"""),format.raw/*12.15*/("""{"""),format.raw/*12.16*/("""display:block;width:100%;padding:120px 0 20px;overflow:hidden;background-color:transparent;z-index:5000;text-align:center;"""),format.raw/*12.138*/("""}"""),format.raw/*12.139*/("""
"""),format.raw/*13.1*/("""#freecssfooter div#fcssholder div"""),format.raw/*13.34*/("""{"""),format.raw/*13.35*/("""display:none;"""),format.raw/*13.48*/("""}"""),format.raw/*13.49*/("""
"""),format.raw/*14.1*/("""#freecssfooter div#fcssholder div:first-child"""),format.raw/*14.46*/("""{"""),format.raw/*14.47*/("""display:block;"""),format.raw/*14.61*/("""}"""),format.raw/*14.62*/("""
"""),format.raw/*15.1*/("""#freecssfooter div#fcssholder div:first-child a"""),format.raw/*15.48*/("""{"""),format.raw/*15.49*/("""float:none;margin:0 auto;"""),format.raw/*15.74*/("""}"""),format.raw/*15.75*/("""
"""),format.raw/*16.1*/("""</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script   type="text/javascript", language="javascript">
  function updateInternal(id, headlines)"""),format.raw/*19.41*/("""{"""),format.raw/*19.42*/("""
    """),format.raw/*20.5*/("""let preprocess = headlines.split("CandidateGenerateeId(").slice(1).map(i => i.split(","))
    let articleIds = preprocess.map(i =>  parseInt(i.slice(0,1)[0]))
    let headlineIds = preprocess.map(i => (i.slice(1)[0])).map(i => eval(i.replace("List(", "[").replace("))", "]")))
    let arr2 = []
    for(i = 0; i < articleIds.length; i++) """),format.raw/*24.44*/("""{"""),format.raw/*24.45*/("""arr2.push("""),format.raw/*24.55*/("""{"""),format.raw/*24.56*/(""""articleId": articleIds[i], "generateeIds": headlineIds[i]"""),format.raw/*24.114*/("""}"""),format.raw/*24.115*/(""")"""),format.raw/*24.116*/("""}"""),format.raw/*24.117*/("""
    """),format.raw/*25.5*/("""alert(JSON.stringify(arr2))

    $.ajax("""),format.raw/*27.12*/("""{"""),format.raw/*27.13*/("""
      """),format.raw/*28.7*/("""url:"http://localhost:9000/update",
      type:"POST",
      data:JSON.stringify("""),format.raw/*30.27*/("""{"""),format.raw/*30.28*/(""" """),format.raw/*30.29*/("""articleId: id, headlines: arr2 """),format.raw/*30.60*/("""}"""),format.raw/*30.61*/("""),
      contentType:"application/json; charset=utf-8",
      dataType:"json",
      success: function()"""),format.raw/*33.26*/("""{"""),format.raw/*33.27*/("""alert( "Success" );"""),format.raw/*33.46*/("""}"""),format.raw/*33.47*/(""",
      fail: function()"""),format.raw/*34.23*/("""{"""),format.raw/*34.24*/("""alert( "Error");"""),format.raw/*34.40*/("""}"""),format.raw/*34.41*/("""
    """),format.raw/*35.5*/("""}"""),format.raw/*35.6*/(""")
  """),format.raw/*36.3*/("""}"""),format.raw/*36.4*/(""";
  function checkifitWorks(a)"""),format.raw/*37.29*/("""{"""),format.raw/*37.30*/("""
    """),format.raw/*38.5*/("""return(a)
  """),format.raw/*39.3*/("""}"""),format.raw/*39.4*/(""";
</script>
</head>
<body>

<div id="preloader" style="display: none;"><img class="preloader" src="./public/images/loader.gif" alt="website template image" style="display: none;"></div>
<div id="wrapper">
  <div class="header-section">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="logo"><a ><img src="./public/images/logo.png" alt="website template image"></a></div>
        </div>
      </div>
    </div>
  </div>
  <header class="header">
    <div class="container">
      <nav class="navbar navbar-inverse navbar-toggleable-md">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#cloapediamenu" aria-controls="cloapediamenu" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
      </nav>
    </div>
  </header>
  <section class="section first-section">
    <div class="container-fluid">
      <div class="masonry-blog clearfix">
        <div class="left-side">
          <div class="masonry-box post-media"><img src="""),_display_(/*66.57*/{articles(0).image}),format.raw/*66.76*/(""" """),format.raw/*66.77*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta" )>

                  <h4><a href="" data-articleid="""),_display_(/*71.50*/{articles(0).id}),format.raw/*71.66*/(""" """),format.raw/*71.67*/("""data-headlines="""),_display_(/*71.83*/{headlines}),format.raw/*71.94*/(""" """),format.raw/*71.95*/("""onclick="updateInternal(this.getAttribute('data-articleid'), this.getAttribute('data-headlines'))" class="article">"""),_display_(/*71.211*/{articles(0).headline}),format.raw/*71.233*/("""</a></h4></div>
              </div>
            </div>
          </div>
        </div>
        <div class="center-side">
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*77.67*/{articles(1).image}),format.raw/*77.86*/(""" """),format.raw/*77.87*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="javascript:updateInternal("""),_display_(/*81.59*/{articles(1).id}),format.raw/*81.75*/(""", """),_display_(/*81.78*/{headlines}),format.raw/*81.89*/(""")">"""),_display_(/*81.93*/{articles(1).headline}),format.raw/*81.115*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*86.67*/{articles(2).image}),format.raw/*86.86*/(""" """),format.raw/*86.87*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="#" onclick="updateInternal("""),_display_(/*90.60*/{articles(2).id}),format.raw/*90.76*/(""", """),_display_(/*90.79*/{headlines}),format.raw/*90.90*/(""")">"""),_display_(/*90.94*/{articles(2).headline}),format.raw/*90.116*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*95.67*/{articles(3).image}),format.raw/*95.86*/(""" """),format.raw/*95.87*/("""style="max-width:98%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="javascript:updateInternal("""),_display_(/*99.59*/{articles(3).id}),format.raw/*99.75*/(""", """),_display_(/*99.78*/{headlines}),format.raw/*99.89*/(""")">"""),_display_(/*99.93*/{articles(3).headline}),format.raw/*99.115*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*104.67*/{articles(4).image}),format.raw/*104.86*/(""" """),format.raw/*104.87*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="javascript:updateInternal("""),_display_(/*108.59*/{articles(4).id}),format.raw/*108.75*/(""", """),_display_(/*108.78*/{headlines}),format.raw/*108.89*/(""")">"""),_display_(/*108.93*/{articles(4).headline}),format.raw/*108.115*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="right-side hidden-md-down">
          <div class="masonry-box post-media"><img src="""),_display_(/*115.57*/{articles(5).image}),format.raw/*115.76*/(""" """),format.raw/*115.77*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="javascript:updateInternal("""),_display_(/*119.59*/{articles(5).id}),format.raw/*119.75*/(""", """),_display_(/*119.78*/{headlines}),format.raw/*119.89*/(""")">"""),_display_(/*119.93*/{articles(5).headline}),format.raw/*119.115*/("""</a></h4>
                  <small></small></div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <br>
    <br>
    <br><br><br>
  </section>
   <footer class="footer" style="opacity:0.1;">
    
  </footer>
</div>
<div id="freecssfooter">
  <div id="fcssholder">
    <div id="bsap_2365" class="bsarocks bsap_b893e54e42ad5b76e7b252f59be18e67"></div>
  </div>
</div>
<script type="text/javascript">
var gaProperty = 'UA-120201777-1';var disableStr = 'ga-disable-' + gaProperty;if (document.cookie.indexOf(disableStr + '=true') > -1) """),format.raw/*141.135*/("""{"""),format.raw/*141.136*/("""window[disableStr] = true;"""),format.raw/*141.162*/("""}"""),format.raw/*141.163*/("""
"""),format.raw/*142.1*/("""function gaOptout()"""),format.raw/*142.20*/("""{"""),format.raw/*142.21*/("""document.cookie = disableStr + '=true; expires=Thu, 31 Dec 2045 23:59:59 UTC; path=/';window[disableStr] = true;alert('Google Tracking has been deactivated');"""),format.raw/*142.179*/("""}"""),format.raw/*142.180*/("""
"""),format.raw/*143.1*/("""(function(i,s,o,g,r,a,m)"""),format.raw/*143.25*/("""{"""),format.raw/*143.26*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*143.76*/("""{"""),format.raw/*143.77*/("""(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*143.112*/("""}"""),format.raw/*143.113*/(""",i[r].l=1*new Date();a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)"""),format.raw/*143.234*/("""}"""),format.raw/*143.235*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create', 'UA-120201777-1', 'auto');ga('set', 'anonymizeIp', true);ga('send', 'pageview');
</script>

</body>
</html>
"""))
      }
    }
  }

  def render(articles:List[meerkat.PageGenerator.Article],headlines:List[meerkat.MeerkatControllerTypes.CandidateGenerateeId]): play.twirl.api.HtmlFormat.Appendable = apply(articles,headlines)

  def f:((List[meerkat.PageGenerator.Article],List[meerkat.MeerkatControllerTypes.CandidateGenerateeId]) => play.twirl.api.HtmlFormat.Appendable) = (articles,headlines) => apply(articles,headlines)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-17T18:35:50.397270
                  SOURCE: /home/leon/projects/meerkat/meerkat-play/app/views/renderPage.scala.html
                  HASH: 8de94decadecd0f8adf65c9cfb07ee3b4261e600
                  MATRIX: 658->1|869->119|896->120|1366->562|1395->563|1546->685|1576->686|1604->687|1665->720|1694->721|1735->734|1764->735|1792->736|1865->781|1894->782|1936->796|1965->797|1993->798|2068->845|2097->846|2150->871|2179->872|2207->873|2430->1068|2459->1069|2491->1074|2857->1412|2886->1413|2924->1423|2953->1424|3040->1482|3070->1483|3100->1484|3130->1485|3162->1490|3230->1530|3259->1531|3293->1538|3402->1619|3431->1620|3460->1621|3519->1652|3548->1653|3680->1757|3709->1758|3756->1777|3785->1778|3837->1802|3866->1803|3910->1819|3939->1820|3971->1825|3999->1826|4030->1830|4058->1831|4116->1861|4145->1862|4177->1867|4216->1879|4244->1880|5345->2954|5385->2973|5414->2974|5700->3233|5737->3249|5766->3250|5809->3266|5841->3277|5870->3278|6014->3394|6058->3416|6273->3604|6313->3623|6342->3624|6634->3889|6671->3905|6701->3908|6733->3919|6764->3923|6808->3945|6991->4101|7031->4120|7060->4121|7353->4387|7390->4403|7420->4406|7452->4417|7483->4421|7527->4443|7710->4599|7750->4618|7779->4619|8070->4883|8107->4899|8137->4902|8169->4913|8200->4917|8244->4939|8428->5095|8469->5114|8499->5115|8792->5380|8830->5396|8861->5399|8894->5410|8926->5414|8971->5436|9208->5645|9249->5664|9279->5665|9572->5930|9610->5946|9641->5949|9674->5960|9706->5964|9751->5986|10364->6569|10395->6570|10451->6596|10482->6597|10511->6598|10559->6617|10589->6618|10777->6776|10808->6777|10837->6778|10890->6802|10920->6803|10999->6853|11029->6854|11094->6889|11125->6890|11276->7011|11307->7012
                  LINES: 14->1|19->2|20->3|29->12|29->12|29->12|29->12|30->13|30->13|30->13|30->13|30->13|31->14|31->14|31->14|31->14|31->14|32->15|32->15|32->15|32->15|32->15|33->16|36->19|36->19|37->20|41->24|41->24|41->24|41->24|41->24|41->24|41->24|41->24|42->25|44->27|44->27|45->28|47->30|47->30|47->30|47->30|47->30|50->33|50->33|50->33|50->33|51->34|51->34|51->34|51->34|52->35|52->35|53->36|53->36|54->37|54->37|55->38|56->39|56->39|83->66|83->66|83->66|88->71|88->71|88->71|88->71|88->71|88->71|88->71|88->71|94->77|94->77|94->77|98->81|98->81|98->81|98->81|98->81|98->81|103->86|103->86|103->86|107->90|107->90|107->90|107->90|107->90|107->90|112->95|112->95|112->95|116->99|116->99|116->99|116->99|116->99|116->99|121->104|121->104|121->104|125->108|125->108|125->108|125->108|125->108|125->108|132->115|132->115|132->115|136->119|136->119|136->119|136->119|136->119|136->119|158->141|158->141|158->141|158->141|159->142|159->142|159->142|159->142|159->142|160->143|160->143|160->143|160->143|160->143|160->143|160->143|160->143|160->143
                  -- GENERATED --
              */
          