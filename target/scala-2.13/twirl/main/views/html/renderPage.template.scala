
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object renderPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[meerkat.PageGeneratorAppl.Article],List[meerkat.MeerkatControllerTypes.CandidateGenerateeId],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(articles: List[meerkat.PageGeneratorAppl.Article], headlines: List[meerkat.MeerkatControllerTypes.CandidateGenerateeId]):play.twirl.api.HtmlFormat.Appendable = {
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

  function updateInternal(id, headlines)"""),format.raw/*20.41*/("""{"""),format.raw/*20.42*/("""
    """),format.raw/*21.5*/("""let preprocess = headlines.split("CandidateGenerateeId(").slice(1).map(i => i.split(","))
    let articleIds = preprocess.map(i =>  parseInt(i.slice(0,1)[0]))
    let headlineIds = preprocess.map(i => (i.slice(1)[0])).map(i => eval(i.replace("List(", "[").replace("))", "]")))
    let arr2 = []
    for(i = 0; i < articleIds.length; i++) """),format.raw/*25.44*/("""{"""),format.raw/*25.45*/("""arr2.push("""),format.raw/*25.55*/("""{"""),format.raw/*25.56*/(""""articleId": articleIds[i], "generateeIds": headlineIds[i]"""),format.raw/*25.114*/("""}"""),format.raw/*25.115*/(""")"""),format.raw/*25.116*/("""}"""),format.raw/*25.117*/("""
    """),format.raw/*26.5*/("""$.ajax("""),format.raw/*26.12*/("""{"""),format.raw/*26.13*/("""
      """),format.raw/*27.7*/("""url:"http://localhost:9000/update",
      type:"POST",
      data:JSON.stringify("""),format.raw/*29.27*/("""{"""),format.raw/*29.28*/(""" """),format.raw/*29.29*/("""articleId: id, headlines: arr2 """),format.raw/*29.60*/("""}"""),format.raw/*29.61*/("""),
      contentType:"application/json; charset=utf-8",
      dataType:"json",
      fail: function()"""),format.raw/*32.23*/("""{"""),format.raw/*32.24*/("""alert( "Error");"""),format.raw/*32.40*/("""}"""),format.raw/*32.41*/("""
    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/(""")
  """),format.raw/*34.3*/("""}"""),format.raw/*34.4*/(""";
  function checkifitWorks(a)"""),format.raw/*35.29*/("""{"""),format.raw/*35.30*/("""
    """),format.raw/*36.5*/("""return(a)
  """),format.raw/*37.3*/("""}"""),format.raw/*37.4*/(""";
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
          <div class="masonry-box post-media"><img src="""),_display_(/*64.57*/{articles(0).image}),format.raw/*64.76*/(""" """),format.raw/*64.77*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta" )>
                  <h4><a href="" data-articleid="""),_display_(/*68.50*/{articles(0).id}),format.raw/*68.66*/(""" """),format.raw/*68.67*/("""data-headlines="""),_display_(/*68.83*/{headlines}),format.raw/*68.94*/(""" """),format.raw/*68.95*/("""onclick="updateInternal(this.getAttribute('data-articleid'), this.getAttribute('data-headlines'))" class="article">"""),_display_(/*68.211*/{articles(0).headline}),format.raw/*68.233*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="center-side">
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*75.67*/{articles(1).image}),format.raw/*75.86*/(""" """),format.raw/*75.87*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="" data-articleid="""),_display_(/*79.50*/{articles(1).id}),format.raw/*79.66*/(""" """),format.raw/*79.67*/("""data-headlines="""),_display_(/*79.83*/{headlines}),format.raw/*79.94*/(""" """),format.raw/*79.95*/("""onclick="updateInternal(this.getAttribute('data-articleid'), this.getAttribute('data-headlines'))" class="article">"""),_display_(/*79.211*/{articles(1).headline}),format.raw/*79.233*/("""</a></h4>

                </div>
              </div>
            </div>
          </div>
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*85.67*/{articles(2).image}),format.raw/*85.86*/(""" """),format.raw/*85.87*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="" data-articleid="""),_display_(/*89.50*/{articles(2).id}),format.raw/*89.66*/(""" """),format.raw/*89.67*/("""data-headlines="""),_display_(/*89.83*/{headlines}),format.raw/*89.94*/(""" """),format.raw/*89.95*/("""onclick="updateInternal(this.getAttribute('data-articleid'), this.getAttribute('data-headlines'))" class="article">"""),_display_(/*89.211*/{articles(2).headline}),format.raw/*89.233*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*94.67*/{articles(3).image}),format.raw/*94.86*/(""" """),format.raw/*94.87*/("""style="max-width:98%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="" data-articleid="""),_display_(/*98.50*/{articles(3).id}),format.raw/*98.66*/(""" """),format.raw/*98.67*/("""data-headlines="""),_display_(/*98.83*/{headlines}),format.raw/*98.94*/(""" """),format.raw/*98.95*/("""onclick="updateInternal(this.getAttribute('data-articleid'), this.getAttribute('data-headlines'))" class="article">"""),_display_(/*98.211*/{articles(3).headline}),format.raw/*98.233*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*103.67*/{articles(4).image}),format.raw/*103.86*/(""" """),format.raw/*103.87*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="" data-articleid="""),_display_(/*107.50*/{articles(4).id}),format.raw/*107.66*/(""" """),format.raw/*107.67*/("""data-headlines="""),_display_(/*107.83*/{headlines}),format.raw/*107.94*/(""" """),format.raw/*107.95*/("""onclick="updateInternal(this.getAttribute('data-articleid'), this.getAttribute('data-headlines'))" class="article">"""),_display_(/*107.211*/{articles(4).headline}),format.raw/*107.233*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="right-side hidden-md-down">
          <div class="masonry-box post-media"><img src="""),_display_(/*114.57*/{articles(5).image}),format.raw/*114.76*/(""" """),format.raw/*114.77*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="" data-articleid="""),_display_(/*118.50*/{articles(5).id}),format.raw/*118.66*/(""" """),format.raw/*118.67*/("""data-headlines="""),_display_(/*118.83*/{headlines}),format.raw/*118.94*/(""" """),format.raw/*118.95*/("""onclick="updateInternal(this.getAttribute('data-articleid'), this.getAttribute('data-headlines'))" class="article">"""),_display_(/*118.211*/{articles(5).headline}),format.raw/*118.233*/("""</a></h4>
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
var gaProperty = 'UA-120201777-1';var disableStr = 'ga-disable-' + gaProperty;if (document.cookie.indexOf(disableStr + '=true') > -1) """),format.raw/*140.135*/("""{"""),format.raw/*140.136*/("""window[disableStr] = true;"""),format.raw/*140.162*/("""}"""),format.raw/*140.163*/("""
"""),format.raw/*141.1*/("""function gaOptout()"""),format.raw/*141.20*/("""{"""),format.raw/*141.21*/("""document.cookie = disableStr + '=true; expires=Thu, 31 Dec 2045 23:59:59 UTC; path=/';window[disableStr] = true;alert('Google Tracking has been deactivated');"""),format.raw/*141.179*/("""}"""),format.raw/*141.180*/("""
"""),format.raw/*142.1*/("""(function(i,s,o,g,r,a,m)"""),format.raw/*142.25*/("""{"""),format.raw/*142.26*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*142.76*/("""{"""),format.raw/*142.77*/("""(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*142.112*/("""}"""),format.raw/*142.113*/(""",i[r].l=1*new Date();a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)"""),format.raw/*142.234*/("""}"""),format.raw/*142.235*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create', 'UA-120201777-1', 'auto');ga('set', 'anonymizeIp', true);ga('send', 'pageview');
</script>

</body>
</html>
"""))
      }
    }
  }

  def render(articles:List[meerkat.PageGeneratorAppl.Article],headlines:List[meerkat.MeerkatControllerTypes.CandidateGenerateeId]): play.twirl.api.HtmlFormat.Appendable = apply(articles,headlines)

  def f:((List[meerkat.PageGeneratorAppl.Article],List[meerkat.MeerkatControllerTypes.CandidateGenerateeId]) => play.twirl.api.HtmlFormat.Appendable) = (articles,headlines) => apply(articles,headlines)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-18T19:08:40.433737
                  SOURCE: /home/leon/projects/meerkat/meerkat-play/app/views/renderPage.scala.html
                  HASH: f37492bdd13a3ad3ff1c9e6d11cb0e788c3c4303
                  MATRIX: 662->1|877->123|904->124|1374->566|1403->567|1554->689|1584->690|1612->691|1673->724|1702->725|1743->738|1772->739|1800->740|1873->785|1902->786|1944->800|1973->801|2001->802|2076->849|2105->850|2158->875|2187->876|2215->877|2439->1073|2468->1074|2500->1079|2866->1417|2895->1418|2933->1428|2962->1429|3049->1487|3079->1488|3109->1489|3139->1490|3171->1495|3206->1502|3235->1503|3269->1510|3378->1591|3407->1592|3436->1593|3495->1624|3524->1625|3653->1726|3682->1727|3726->1743|3755->1744|3787->1749|3815->1750|3846->1754|3874->1755|3932->1785|3961->1786|3993->1791|4032->1803|4060->1804|5161->2878|5201->2897|5230->2898|5515->3156|5552->3172|5581->3173|5624->3189|5656->3200|5685->3201|5829->3317|5873->3339|6105->3544|6145->3563|6174->3564|6457->3820|6494->3836|6523->3837|6566->3853|6598->3864|6627->3865|6771->3981|6815->4003|6999->4160|7039->4179|7068->4180|7351->4436|7388->4452|7417->4453|7460->4469|7492->4480|7521->4481|7665->4597|7709->4619|7892->4775|7932->4794|7961->4795|8243->5050|8280->5066|8309->5067|8352->5083|8384->5094|8413->5095|8557->5211|8601->5233|8785->5389|8826->5408|8856->5409|9140->5665|9178->5681|9208->5682|9252->5698|9285->5709|9315->5710|9460->5826|9505->5848|9742->6057|9783->6076|9813->6077|10097->6333|10135->6349|10165->6350|10209->6366|10242->6377|10272->6378|10417->6494|10462->6516|11075->7099|11106->7100|11162->7126|11193->7127|11222->7128|11270->7147|11300->7148|11488->7306|11519->7307|11548->7308|11601->7332|11631->7333|11710->7383|11740->7384|11805->7419|11836->7420|11987->7541|12018->7542
                  LINES: 14->1|19->2|20->3|29->12|29->12|29->12|29->12|30->13|30->13|30->13|30->13|30->13|31->14|31->14|31->14|31->14|31->14|32->15|32->15|32->15|32->15|32->15|33->16|37->20|37->20|38->21|42->25|42->25|42->25|42->25|42->25|42->25|42->25|42->25|43->26|43->26|43->26|44->27|46->29|46->29|46->29|46->29|46->29|49->32|49->32|49->32|49->32|50->33|50->33|51->34|51->34|52->35|52->35|53->36|54->37|54->37|81->64|81->64|81->64|85->68|85->68|85->68|85->68|85->68|85->68|85->68|85->68|92->75|92->75|92->75|96->79|96->79|96->79|96->79|96->79|96->79|96->79|96->79|102->85|102->85|102->85|106->89|106->89|106->89|106->89|106->89|106->89|106->89|106->89|111->94|111->94|111->94|115->98|115->98|115->98|115->98|115->98|115->98|115->98|115->98|120->103|120->103|120->103|124->107|124->107|124->107|124->107|124->107|124->107|124->107|124->107|131->114|131->114|131->114|135->118|135->118|135->118|135->118|135->118|135->118|135->118|135->118|157->140|157->140|157->140|157->140|158->141|158->141|158->141|158->141|158->141|159->142|159->142|159->142|159->142|159->142|159->142|159->142|159->142|159->142
                  -- GENERATED --
              */
          