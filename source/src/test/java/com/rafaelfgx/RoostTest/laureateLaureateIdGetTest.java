// ********RoostGPT********
/*
Test generated by RoostGPT for test MiniProjects using AI Type Open AI and AI Model gpt-4-1106-preview

Test generated for /laureate/{laureateID}_get for http method type GET in rest-assured framework

RoostTestHash=3a8d014c99


*/

// ********RoostGPT********
package com.rafaelfgx.RoostTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.Arrays;

public class laureateLaureateIdGetTest {

	List<Map<String, String>> envList = new ArrayList<>();

	@BeforeEach
	public void setUp() {
		TestdataLoader dataloader = new TestdataLoader();
		String[] envVarsList = { "laureateID" };
		envList = dataloader.load("src\\test\\java\\com\\rafaelfgx\\RoostTest\\laureate_laureateIDGetTest.csv",
				envVarsList);
	}

	@Test
	public void laureateLaureateIdGet_Test() throws JSONException {
		this.setUp();
		Integer testNumber = 1;
		for (Map<String, String> testData : envList) {
			RestAssured.baseURI = (testData.get("BASE_URL") != null && !testData.get("BASE_URL").isEmpty())
					? testData.get("BASE_URL") : "http://api.nobelprize.org/2.1";

			Response responseObj = given()
				.pathParam("laureateID", testData.get("laureateID") != null ? testData.get("laureateID") : "")
				.when()
				.get("/laureate/{laureateID}")
				.then()
				.extract()
				.response();
			JsonPath response;
			String contentType = responseObj.getContentType();

			System.out.printf("Test Case %d: laureateLaureateIdGet_Test \n", testNumber++);
			System.out.println("Request: GET /laureate/{laureateID}");
			System.out.println("Status Code: " + responseObj.statusCode());
			if (testData.get("statusCode") != null) {
				MatcherAssert.assertThat(Integer.toString(responseObj.statusCode()),
						equalTo(Integer.toString(Integer.parseInt(testData.get("statusCode")))));
			}
			else {
				List<Integer> expectedStatusCodes = Arrays.asList("200", "400", "404", "422");
				MatcherAssert.assertThat(Integer.toString(responseObj.statusCode()), is(in(expectedStatusCodes)));
			}

			if (contentType.contains("application/xml") || contentType.contains("text/xml")) {
				String xmlResponse = responseObj.asString();
				JSONObject jsonResponse = XML.toJSONObject(xmlResponse);
				JSONObject jsonData = jsonResponse.getJSONObject("xml");
				String jsonString = jsonData.toString();
				response = new JsonPath(jsonString);

			}
			else if (contentType.contains("application/json")) {
				response = responseObj.jsonPath();
			}
			else {
				System.out.println("Response content type found: " + contentType
						+ ", but RoostGPT currently only supports the following response content types: application/json,text/xml,application/xml");
				continue;
			}

			if (Integer.toString(responseObj.statusCode()) == "200") {
				System.out.println("Description: Successful call of Laureate given the ID");

				if (response.get("laureate") != null) {
					if (response.get("laureate.id") != null) {
						MatcherAssert.assertThat(response.get("laureate.id"), instanceOf(Integer.class));
						MatcherAssert.assertThat(response.getDouble("laureate.id"), greaterThanOrEqualTo(1));

					}

					if (response.get("laureate.laureateIfPerson") != null) {
						if (response.get("laureate.laureateIfPerson.knownName") != null) {
						}

						if (response.get("laureate.laureateIfPerson.givenName") != null) {
						}

						if (response.get("laureate.laureateIfPerson.familyName") != null) {
						}

						if (response.get("laureate.laureateIfPerson.fullName") != null) {
						}

						if (response.get("laureate.laureateIfPerson.filename") != null) {
							MatcherAssert.assertThat(response.get("laureate.laureateIfPerson.filename"),
									instanceOf(String.class));
						}

						if (response.get("laureate.laureateIfPerson.penname") != null) {
							MatcherAssert.assertThat(response.get("laureate.laureateIfPerson.penname"),
									instanceOf(String.class));
						}

						if (response.get("laureate.laureateIfPerson.gender") != null) {
							MatcherAssert.assertThat(response.get("laureate.laureateIfPerson.gender"),
									instanceOf(String.class));
							MatcherAssert.assertThat(response.getString("laureate.laureateIfPerson.gender"),
									anyOf(equalTo("female"), equalTo("male")));

						}

						if (response.get("laureate.laureateIfPerson.birth") != null) {
						}

						if (response.get("laureate.laureateIfPerson.death") != null) {
						}

					}

					if (response.get("laureate.laureateIfOrg") != null) {
						if (response.get("laureate.laureateIfOrg.orgName") != null) {
						}

						if (response.get("laureate.laureateIfOrg.nativeName") != null) {
							MatcherAssert.assertThat(response.get("laureate.laureateIfOrg.nativeName"),
									instanceOf(String.class));
						}

						if (response.get("laureate.laureateIfOrg.acronym") != null) {
							MatcherAssert.assertThat(response.get("laureate.laureateIfOrg.acronym"),
									instanceOf(String.class));
						}

						if (response.get("laureate.laureateIfOrg.founded") != null) {
						}

						if (response.get("laureate.laureateIfOrg.dissolution") != null) {
						}

						if (response.get("laureate.laureateIfOrg.headquarters") != null) {
						}

					}

					if (response.get("laureate.wikipedia") != null) {
						if (response.get("laureate.wikipedia.slug") != null) {
							MatcherAssert.assertThat(response.get("laureate.wikipedia.slug"), instanceOf(String.class));
						}

						if (response.get("laureate.wikipedia.english") != null) {
							MatcherAssert.assertThat(response.get("laureate.wikipedia.english"),
									instanceOf(String.class));
						}

					}

					if (response.get("laureate.wikidata") != null) {
						if (response.get("laureate.wikidata.id") != null) {
							MatcherAssert.assertThat(response.get("laureate.wikidata.id"), instanceOf(String.class));
						}

						if (response.get("laureate.wikidata.url") != null) {
							MatcherAssert.assertThat(response.get("laureate.wikidata.url"), instanceOf(String.class));
						}

					}

					if (response.get("laureate.sameAs") != null) {
						for (int i = 0; i < response.getList("laureate.sameAs").size(); i++) {
						}
						MatcherAssert.assertThat(response.getList("laureate.sameAs"), instanceOf(List.class));

					}

					if (response.get("laureate.links") != null) {
						for (int i = 0; i < response.getList("laureate.links").size(); i++) {
							if (response.get("laureate.links[" + i + "].rel") != null) {
								MatcherAssert.assertThat(response.get("laureate.links[" + i + "].rel"),
										instanceOf(String.class));
							}

							if (response.get("laureate.links[" + i + "].href") != null) {
								MatcherAssert.assertThat(response.get("laureate.links[" + i + "].href"),
										instanceOf(String.class));
							}

							if (response.get("laureate.links[" + i + "].action") != null) {
								MatcherAssert.assertThat(response.get("laureate.links[" + i + "].action"),
										instanceOf(String.class));
							}

							if (response.get("laureate.links[" + i + "].types") != null) {
								MatcherAssert.assertThat(response.get("laureate.links[" + i + "].types"),
										instanceOf(String.class));
							}

						}
						MatcherAssert.assertThat(response.getList("laureate.links"), instanceOf(List.class));

					}

					if (response.get("laureate.nobelPrizes") != null) {
						for (int i = 0; i < response.getList("laureate.nobelPrizes").size(); i++) {
							if (response.get("laureate.nobelPrizes[" + i + "].awardYear") != null) {
								MatcherAssert.assertThat(response.get("laureate.nobelPrizes[" + i + "].awardYear"),
										instanceOf(Integer.class));
							}

							if (response.get("laureate.nobelPrizes[" + i + "].category") != null) {
							}

							if (response.get("laureate.nobelPrizes[" + i + "].categoryFullName") != null) {
							}

							if (response.get("laureate.nobelPrizes[" + i + "].sortOrder") != null) {
								MatcherAssert.assertThat(response.get("laureate.nobelPrizes[" + i + "].sortOrder"),
										instanceOf(String.class));
								MatcherAssert.assertThat(
										response.getString("laureate.nobelPrizes[" + i + "].sortOrder"),
										anyOf(equalTo("1"), equalTo("2"), equalTo("3")));

							}

							if (response.get("laureate.nobelPrizes[" + i + "].portion") != null) {
								MatcherAssert.assertThat(response.get("laureate.nobelPrizes[" + i + "].portion"),
										instanceOf(String.class));
								MatcherAssert.assertThat(response.getString("laureate.nobelPrizes[" + i + "].portion"),
										anyOf(equalTo("1"), equalTo("1/2"), equalTo("1/3"), equalTo("1/4")));

							}

							if (response.get("laureate.nobelPrizes[" + i + "].dateAwarded") != null) {
								MatcherAssert.assertThat(response.get("laureate.nobelPrizes[" + i + "].dateAwarded"),
										instanceOf(String.class));
							}

							if (response.get("laureate.nobelPrizes[" + i + "].prizeStatus") != null) {
								MatcherAssert.assertThat(response.get("laureate.nobelPrizes[" + i + "].prizeStatus"),
										instanceOf(String.class));
								MatcherAssert.assertThat(
										response.getString("laureate.nobelPrizes[" + i + "].prizeStatus"),
										anyOf(equalTo("received"), equalTo("declined"), equalTo("restricted")));

							}

							if (response.get("laureate.nobelPrizes[" + i + "].motivation") != null) {
							}

							if (response.get("laureate.nobelPrizes[" + i + "].prizeAmount") != null) {
								MatcherAssert.assertThat(response.get("laureate.nobelPrizes[" + i + "].prizeAmount"),
										instanceOf(Integer.class));
							}

							if (response.get("laureate.nobelPrizes[" + i + "].prizeAmountAdjusted") != null) {
								MatcherAssert.assertThat(
										response.get("laureate.nobelPrizes[" + i + "].prizeAmountAdjusted"),
										instanceOf(Integer.class));
							}

							if (response.get("laureate.nobelPrizes[" + i + "].affiliations") != null) {
								for (int i1 = 0; i1 < response.getList("laureate.nobelPrizes[" + i + "].affiliations")
									.size(); i1++) {
								}
								MatcherAssert.assertThat(
										response.getList("laureate.nobelPrizes[" + i + "].affiliations"),
										instanceOf(List.class));

							}

							if (response.get("laureate.nobelPrizes[" + i + "].residences") != null) {
								for (int i1 = 0; i1 < response.getList("laureate.nobelPrizes[" + i + "].residences")
									.size(); i1++) {
								}
								MatcherAssert.assertThat(response.getList("laureate.nobelPrizes[" + i + "].residences"),
										instanceOf(List.class));

							}

							if (response.get("laureate.nobelPrizes[" + i + "].links") != null) {
								for (int i1 = 0; i1 < response.getList("laureate.nobelPrizes[" + i + "].links")
									.size(); i1++) {
								}
								MatcherAssert.assertThat(response.getList("laureate.nobelPrizes[" + i + "].links"),
										instanceOf(List.class));

							}

						}
						MatcherAssert.assertThat(response.getList("laureate.nobelPrizes"), instanceOf(List.class));

					}

				}
			}
			if (Integer.toString(responseObj.statusCode()) == "400") {
				System.out.println(
						"Description: Bad request.The request could not be understood by the server due to malformed syntax, modifications needed.");

				if (response.get("code") != null) {
					MatcherAssert.assertThat(response.get("code"), instanceOf(String.class));
				}

				if (response.get("message") != null) {
					MatcherAssert.assertThat(response.get("message"), instanceOf(String.class));
				}
			}
			if (Integer.toString(responseObj.statusCode()) == "404") {
				System.out.println(
						"Description: Not Found. The requested resource could not be found but may be available again in the future.");

				if (response.get("code") != null) {
					MatcherAssert.assertThat(response.get("code"), instanceOf(String.class));
				}

				if (response.get("message") != null) {
					MatcherAssert.assertThat(response.get("message"), instanceOf(String.class));
				}
			}
			if (Integer.toString(responseObj.statusCode()) == "422") {
				System.out.println(
						"Description: Unprocessable Entity. The request was well-formed but was unable to be followed due to semantic errors.");

				if (response.get("code") != null) {
					MatcherAssert.assertThat(response.get("code"), instanceOf(String.class));
				}

				if (response.get("message") != null) {
					MatcherAssert.assertThat(response.get("message"), instanceOf(String.class));
				}
			}

		}
	}

}
