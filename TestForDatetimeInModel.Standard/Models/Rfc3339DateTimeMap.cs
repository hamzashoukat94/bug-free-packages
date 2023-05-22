// <copyright file="Rfc3339DateTimeMap.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace TestForDatetimeInModel.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using TestForDatetimeInModel.Standard;
    using TestForDatetimeInModel.Standard.Utilities;

    /// <summary>
    /// Rfc3339DateTimeMap.
    /// </summary>
    public class Rfc3339DateTimeMap
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Rfc3339DateTimeMap"/> class.
        /// </summary>
        public Rfc3339DateTimeMap()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="Rfc3339DateTimeMap"/> class.
        /// </summary>
        /// <param name="dateTime">dateTime.</param>
        public Rfc3339DateTimeMap(
            Dictionary<string, DateTime> dateTime)
        {
            this.DateTime = dateTime;
        }

        /// <summary>
        /// Gets or sets DateTime.
        /// </summary>
        [JsonConverter(typeof(MapDateTimeConverter), typeof(IsoDateTimeConverter))]
        [JsonProperty("dateTime")]
        public Dictionary<string, DateTime> DateTime { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"Rfc3339DateTimeMap : ({string.Join(", ", toStringOutput)})";
        }

        /// <inheritdoc/>
        public override bool Equals(object obj)
        {
            if (obj == null)
            {
                return false;
            }

            if (obj == this)
            {
                return true;
            }
            return obj is Rfc3339DateTimeMap other &&                ((this.DateTime == null && other.DateTime == null) || (this.DateTime?.Equals(other.DateTime) == true));
        }
        
        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"DateTime = {(this.DateTime == null ? "null" : this.DateTime.ToString())}");
        }
    }
}