
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

  def render(articles:List[meerkat.PageGenerator.Article],headlines:List[meerkat.MeerkatControllerTypes.CandidateGenerateeId]): play.twirl.api.HtmlFormat.Appendable = apply(articles,headlines)

  def f:((List[meerkat.PageGenerator.Article],List[meerkat.MeerkatControllerTypes.CandidateGenerateeId]) => play.twirl.api.HtmlFormat.Appendable) = (articles,headlines) => apply(articles,headlines)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-18T15:07:29.436096
                  SOURCE: /home/leon/projects/meerkat/meerkat-play/app/views/renderPage.scala.html
                  HASH: c9df151d3eb9b15749731fd6115a3dc0c1cc1b0f
                  MATRIX: 658->1|869->119|896->120|1366->562|1395->563|1546->685|1576->686|1604->687|1665->720|1694->721|1735->734|1764->735|1792->736|1865->781|1894->782|1936->796|1965->797|1993->798|2068->845|2097->846|2150->871|2179->872|2207->873|2431->1069|2460->1070|2492->1075|2858->1413|2887->1414|2925->1424|2954->1425|3041->1483|3071->1484|3101->1485|3131->1486|3163->1491|3198->1498|3227->1499|3261->1506|3370->1587|3399->1588|3428->1589|3487->1620|3516->1621|3645->1722|3674->1723|3718->1739|3747->1740|3779->1745|3807->1746|3838->1750|3866->1751|3924->1781|3953->1782|3985->1787|4024->1799|4052->1800|5153->2874|5193->2893|5222->2894|5507->3152|5544->3168|5573->3169|5616->3185|5648->3196|5677->3197|5821->3313|5865->3335|6097->3540|6137->3559|6166->3560|6449->3816|6486->3832|6515->3833|6558->3849|6590->3860|6619->3861|6763->3977|6807->3999|6991->4156|7031->4175|7060->4176|7343->4432|7380->4448|7409->4449|7452->4465|7484->4476|7513->4477|7657->4593|7701->4615|7884->4771|7924->4790|7953->4791|8235->5046|8272->5062|8301->5063|8344->5079|8376->5090|8405->5091|8549->5207|8593->5229|8777->5385|8818->5404|8848->5405|9132->5661|9170->5677|9200->5678|9244->5694|9277->5705|9307->5706|9452->5822|9497->5844|9734->6053|9775->6072|9805->6073|10089->6329|10127->6345|10157->6346|10201->6362|10234->6373|10264->6374|10409->6490|10454->6512|11067->7095|11098->7096|11154->7122|11185->7123|11214->7124|11262->7143|11292->7144|11480->7302|11511->7303|11540->7304|11593->7328|11623->7329|11702->7379|11732->7380|11797->7415|11828->7416|11979->7537|12010->7538
                  LINES: 14->1|19->2|20->3|29->12|29->12|29->12|29->12|30->13|30->13|30->13|30->13|30->13|31->14|31->14|31->14|31->14|31->14|32->15|32->15|32->15|32->15|32->15|33->16|37->20|37->20|38->21|42->25|42->25|42->25|42->25|42->25|42->25|42->25|42->25|43->26|43->26|43->26|44->27|46->29|46->29|46->29|46->29|46->29|49->32|49->32|49->32|49->32|50->33|50->33|51->34|51->34|52->35|52->35|53->36|54->37|54->37|81->64|81->64|81->64|85->68|85->68|85->68|85->68|85->68|85->68|85->68|85->68|92->75|92->75|92->75|96->79|96->79|96->79|96->79|96->79|96->79|96->79|96->79|102->85|102->85|102->85|106->89|106->89|106->89|106->89|106->89|106->89|106->89|106->89|111->94|111->94|111->94|115->98|115->98|115->98|115->98|115->98|115->98|115->98|115->98|120->103|120->103|120->103|124->107|124->107|124->107|124->107|124->107|124->107|124->107|124->107|131->114|131->114|131->114|135->118|135->118|135->118|135->118|135->118|135->118|135->118|135->118|157->140|157->140|157->140|157->140|158->141|158->141|158->141|158->141|158->141|159->142|159->142|159->142|159->142|159->142|159->142|159->142|159->142|159->142
                  -- GENERATED --
              */
          